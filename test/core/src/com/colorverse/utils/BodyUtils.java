package com.colorverse.utils;

import com.badlogic.gdx.physics.box2d.Body;
import com.colorverse.box2d.UserData;
import com.colorverse.enums.UserDataType;

/**
 * Created by bwhite on 1/27/2015.
 */
public class BodyUtils {

    public static boolean bodyIsCircle(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.CIRCLE;
    }

    public static boolean bodyIsGround(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.GROUND;
    }
}
