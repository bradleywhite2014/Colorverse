package com.colorverse.box2d;

import com.colorverse.enums.UserDataType;

/**
 * Created by bwhite on 1/27/2015.
 */
public abstract class UserData {
    protected UserDataType userDataType;
    protected float width;
    protected float height;
    protected float radius;

    public UserData() {

    }

    public UserData(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public UserData(float radius) {
        this.radius = radius;
    }

    public UserDataType getUserDataType() {
        return userDataType;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
