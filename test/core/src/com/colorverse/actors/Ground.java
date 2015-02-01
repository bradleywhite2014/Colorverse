package com.colorverse.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.colorverse.box2d.GroundUserData;
import com.colorverse.box2d.UserData;

/**
 * Created by bwhite on 1/26/2015.
 */
public class Ground extends GameActor {
    public Ground(Body body) {
        super(body);
    }

    @Override
    public UserData getUserData() {
        return (GroundUserData) userData;
    }
}
