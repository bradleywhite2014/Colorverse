package com.colorverse.utils;

public class Tile {
    public int type, position;
    public boolean obstacle;



    public static Tile newTile(int tilePosition) {
        this.type = 1;
        this.obstacle = false;
        this position = tilePosition;
    }
    public static Tile newTile(int tileType, boolean isObstacle, int tilePosition) {

        if(tilePosition == Constants.LEFT_TILE_POSITION){
            if(tileType == Constants.LEFT_WALL_OBSTACLE_TILE) {

            }
            else if(tileType == Constants.LEFT_WALL_TILE) {

            }
            else {
                this.type = Constants.LEFT_WALL_TILE;
            }
        }
        if(tilePosition == Constants.RIGHT_TILE_POSITION){
            if(tileType == Constants.RIGHT_WALL_OBSTACLE_TILE) {

            }
            else if(tileType == Constants.RIGHT_WALL_TILE) {

            }
            else {
                this.type = Constants.RIGHT_WALL_TILE;
            }
        }

    }






}