package io.github.some_example_name.igra;

public class GameConfig {

    // Player
    public static final int PLAYER_WIDTH = 96;
    public static final int PLAYER_HEIGHT = 96;
    public static final int PLAYER_WIDTH_SMALLER = 28;
    public static final int PLAYER_HEIGHT_SMALLER = 28;

    public static final float PLAYER_SPEED = 200f; // Speed of the player
    public static final float PLAYER_SPEED_SMALLER = 100f; // Speed of the player
    public static final float PLAYER_DAMAGE = 10.0f; // Damage dealt by the player
    public static final int PLAYER_HEALTH = 100; // Health of the player


    // Player Animations
    public static final float PLAYER_ANIMATION_IDLE_DURATION = 0.1f;
    public static final float PLAYER_ANIMATION_WALKING_DURATION = 0.1f;
    public static final float PLAYER_ANIMATION_ATTACKING_DURATION = 0.07f;

    // Enemy
    public static final int ENEMY_WIDTH = 96;
    public static final int ENEMY_HEIGHT = 96;
    public static final float ENEMY_SPEED = 100f; // Speed of the player
    public static final float ENEMY_DAMAGE = 10.0f; // Damage dealt by the player
    public static final int ENEMY_HEALTH = 100; // Health of the player
    public static final float ENEMY_VISION_DISTANCE = 1000.0f;
    public static final int ENEMY_ATTACK_DISTANCE = 20;

    // Enemy Animations
    public static final float ENEMY_ANIMATION_IDLE_DURATION = 0.1f;
    public static final float ENEMY_ANIMATION_WALKING_DURATION = 0.1f;
    public static final float ENEMY_ANIMATION_ATTACKING_DURATION = 0.15f;

}
