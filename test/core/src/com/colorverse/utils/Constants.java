package com.colorverse.utils;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by bwhite on 1/26/2015.
 */
public class Constants {
    public static final int APP_WIDTH = 480;
    public static final int APP_HEIGHT = 800;

    public static final Vector2 WORLD_GRAVITY = new Vector2(0, -10);
    public static final float WORLD_TO_SCREEN = 32;

    public static final float GROUND_X = 0;
    public static final float GROUND_Y = 0;
    public static final float GROUND_WIDTH = 50f;
    public static final float GROUND_HEIGHT = 2f;
    public static final float GROUND_DENSITY = 0f;

    public static final float CIRCLE_X = 2f;
    public static final float CIRCLE_Y = 5f;
    public static final float CIRCLE_RADIUS = 1f;
    public static float CIRCLE_DENSITY = 1.0f;
    public static final Vector2 CIRCLE_BOUNCING_LINEAR_IMPULSE = new Vector2(0,13f);

    public static final String CIRCLE_IMAGE_PATH = "sideWall.png";

    //TILE POSITION CONSTANTS
    public static final int LEFT_TILE_POSITION = 1;
    public static final int LEFT_MIDDLE_TILE_POSITION = 2;
    public static final int MIDDLE_TILE_POSITION = 3;
    public static final int RIGHT_MIDDLE_TILE_POSITION = 4;
    public static final int RIGHT_TILE_POSITION = 5;

    //TILE TYPE CONSTANTS
    public static final int DEFAULT_BLANK_TILE = 1;
    public static final int LEFT_WALL_TILE = 2;
    public static final int LEFT_WALL_OBSTACLE_TILE = 3;
    public static final int RIGHT_WALL_TILE = 4;
    public static final int RIGHT_WALL_OBSTACLE_TILE = 5;

    //OBSTACLE CONSTANTS
    public static final int OBSTACLE_WALL = 1;
    public static final int OBSTACLE_BOMB = 2;


}
