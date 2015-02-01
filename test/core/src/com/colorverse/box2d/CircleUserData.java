package com.colorverse.box2d;

import com.badlogic.gdx.math.Vector2;
import com.colorverse.enums.UserDataType;
import com.colorverse.utils.Constants;

/**
 * Created by bwhite on 1/27/2015.
 */
public class CircleUserData extends UserData {

    private Vector2 bouncingLinearImpulse;

    public CircleUserData(float radius) {
        super(radius);
        bouncingLinearImpulse = Constants.CIRCLE_BOUNCING_LINEAR_IMPULSE;
        userDataType = UserDataType.CIRCLE;
    }

    public Vector2 getBouncingLinearImpulse() {
        return bouncingLinearImpulse;
    }

    public void setBouncingLinearImpulse(Vector2 bouncingLinearImpulse) {
        this.bouncingLinearImpulse = bouncingLinearImpulse;
    }

}
