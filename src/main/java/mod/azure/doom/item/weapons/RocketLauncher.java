package mod.azure.doom.item.weapons;

import java.util.function.Consumer;
import java.util.function.Predicate;

import mod.azure.doom.DoomMod;
import mod.azure.doom.entity.projectiles.RocketEntity;
import mod.azure.doom.item.ammo.Rocket;
import mod.azure.doom.util.DoomItems;
import mod.azure.doom.util.ModSoundEvents;
import mod.azure.doom.util.enums.DoomTier;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class RocketLauncher extends RangedWeaponItem {

	public RocketLauncher() {
		super(new Item.Settings().group(DoomMod.DoomWeaponItemGroup).maxCount(1).maxDamage(9000));
	}

	@Override
	public boolean hasGlint(ItemStack stack) {
		return false;
	}

	@Override
	public boolean canRepair(ItemStack stack, ItemStack ingredient) {
		return DoomTier.DOOM.getRepairIngredient().test(ingredient) || super.canRepair(stack, ingredient);
	}

	@Override
	public Predicate<ItemStack> getHeldProjectiles() {
		return getProjectiles();
	}

	@Override
	public Predicate<ItemStack> getProjectiles() {
		return itemStack -> itemStack.getItem() instanceof Rocket;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void onStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int remainingUseTicks) {
		if (entityLiving instanceof PlayerEntity) {
			PlayerEntity playerentity = (PlayerEntity) entityLiving;
			boolean flag = playerentity.abilities.creativeMode
					|| EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
			ItemStack itemstack = playerentity.getArrowType(stack);

			if (!itemstack.isEmpty() || flag) {
				if (itemstack.isEmpty()) {
					itemstack = new ItemStack(DoomItems.ROCKET);
				}

				if (!worldIn.isClient) {
					Rocket arrowitem = (Rocket) (itemstack.getItem() instanceof Rocket ? itemstack.getItem()
							: DoomItems.ROCKET);
					RocketEntity abstractarrowentity = arrowitem.createArrow(worldIn, itemstack, playerentity);
					abstractarrowentity = customeArrow(abstractarrowentity);
					abstractarrowentity.setProperties(playerentity, playerentity.pitch, playerentity.yaw, 0.0F,
							1 * 3.0F, 1.0F);

					abstractarrowentity.setNoGravity(true);

					stack.damage(1, (LivingEntity) playerentity, (Consumer) ((p) -> {
						((LivingEntity) p).sendToolBreakStatus(playerentity.getActiveHand());
					}));
					worldIn.spawnEntity(abstractarrowentity);
				}
				worldIn.playSound((PlayerEntity) null, playerentity.getX(), playerentity.getY(), playerentity.getZ(),
						ModSoundEvents.ROCKET_FIRING, SoundCategory.PLAYERS, 1.0F,
						1.0F / (RANDOM.nextFloat() * 0.4F + 1.2F) + 0.25F * 0.5F);
				if (!playerentity.abilities.creativeMode) {
					itemstack.decrement(1);
					if (itemstack.isEmpty()) {
						playerentity.inventory.removeOne(itemstack);
					}
				}
			}
		}
	}

	public static float getArrowVelocity(int charge) {
		float f = (float) charge / 20.0F;
		f = (f * f + f * 2.0F) / 3.0F;
		if (f > 1.0F) {
			f = 1.0F;
		}

		return f;
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return 72000;
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.NONE;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		boolean bl = !user.getArrowType(itemStack).isEmpty();
		if (!user.abilities.creativeMode && !bl) {
			return TypedActionResult.fail(itemStack);
		} else {
			user.setCurrentHand(hand);
			return TypedActionResult.consume(itemStack);
		}
	}

	public RocketEntity customeArrow(RocketEntity arrow) {
		return arrow;
	}

	@Override
	public int getRange() {
		return 15;
	}
}