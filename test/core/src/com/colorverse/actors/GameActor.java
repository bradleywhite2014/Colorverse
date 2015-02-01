package com.colorverse.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.colorverse.box2d.UserData;
import com.colorverse.utils.Constants;
import com.badlogic.gdx.math.Circle;

/**
 * Created by bwhite on 1/26/2015.
 */
public abstract class GameActor extends Actor {

    protected Body body;
    protected UserData userData;
    protected Circle screenCircle;

    public GameActor(Body body) {
        this.body = body;
        this.userData = (UserData) body.getUserData();
        screenCircle = new Circle();
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        if (body.getUserData() != null) {
            updateCircle();
        } else {
            // This means the world destroyed the body (enemy or runner went out of bounds)
            remove();
        }

    }

    private void updateCircle() {
        screenCircle.x = transformToScreen(body.getPosition().x - userData.getWidth() / 2);
        screenCircle.y = transformToScreen(body.getPosition().y - userData.getHeight() / 2);
        screenCircle.radius = transformToScreen(userData.getRadius());
    }

    public abstract UserData getUserData();

    protected float transformToScreen(float n) {
        return Constants.WORLD_TO_SCREEN * n;
    }

}
