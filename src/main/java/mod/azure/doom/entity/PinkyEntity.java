package mod.azure.doom.entity;

import java.util.Random;

import mod.azure.doom.util.ModSoundEvents;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class PinkyEntity extends DemonEntity implements IAnimatedEntity {

	EntityAnimationManager manager = new EntityAnimationManager();
	EntityAnimationController<PinkyEntity> controller = new EntityAnimationController<PinkyEntity>(this,
			"walkController", 0.09F, this::animationPredicate);

	public PinkyEntity(EntityType<PinkyEntity> entityType, World worldIn) {
		super(entityType, worldIn);
		manager.addAnimationController(controller);
	}

	private <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> event) {
		if (!(lastLimbDistance > -0.15F && lastLimbDistance < 0.15F)) {
			controller.setAnimation(new AnimationBuilder().addAnimation("walking", true));
			return true;
		}
		return false;
	}

	@Override
	public EntityAnimationManager getAnimationManager() {
		return manager;
	}

	public static boolean spawning(EntityType<BaronEntity> p_223337_0_, World p_223337_1_, SpawnReason reason,
			BlockPos p_223337_3_, Random p_223337_4_) {
		return p_223337_1_.getDifficulty() != Difficulty.PEACEFUL;
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8D));
		this.goalSelector.add(8, new LookAroundGoal(this));
		this.initCustomGoals();
	}

	protected void initCustomGoals() {
		this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, false));
		this.targetSelector.add(2, new FollowTargetGoal<>(this, PlayerEntity.class, true));
		this.targetSelector.add(3, new FollowTargetGoal<>(this, HostileEntity.class, true));
		this.targetSelector.add(3, new FollowTargetGoal<>(this, MobEntity.class, true));
	}

	public static DefaultAttributeContainer.Builder createMobAttributes() {
		return LivingEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 25.0D)
				.add(EntityAttributes.GENERIC_MAX_HEALTH, 75.0D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6.0D)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D)
				.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.0D);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return ModSoundEvents.PINKY_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSoundEvents.PINKY_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return ModSoundEvents.PINKY_DEATH;
	}

	protected SoundEvent getStepSound() {
		return ModSoundEvents.PINKY_STEP;
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}

}