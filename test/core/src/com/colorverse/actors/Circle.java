package com.colorverse.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.colorverse.box2d.CircleUserData;
import com.colorverse.box2d.UserData;
import com.colorverse.utils.Constants;

/**
 * Created by bwhite on 1/26/2015.
 */
public class Circle extends GameActor {

    private boolean bouncing;

   // private final TextureRegion textureRegion;
    private float stateTime;
    private com.badlogic.gdx.math.Circle circleRegionBounds;
    private int speed = 10;

    public Circle(Body body) {
        super(body);
        //textureRegion = new TextureRegion(new Texture(Gdx.files.internal(Constants.CIRCLE_IMAGE_PATH)));
        circleRegionBounds = new com.badlogic.gdx.math.Circle(getUserData().getRadius() / 2, getUserData().getRadius() / 2 , getUserData().getRadius());
    }

    @Override
    public CircleUserData getUserData() {
        return (CircleUserData) userData;
    }

    public void bounce() {

        if (!bouncing) {
            body.applyLinearImpulse(getUserData().getBouncingLinearImpulse(), body.getWorldCenter(), true);
            bouncing = true;
        }

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }

    public void landed() {
        bouncing = false;
    }
}
