package com.colorverse.utils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.colorverse.box2d.CircleUserData;
import com.colorverse.box2d.GroundUserData;

/**
 * Created by bwhite on 1/26/2015.
 */
public class WorldUtils {

    public static World createWorld() {
        return new World(Constants.WORLD_GRAVITY, true);
    }

    public static Body createGround(World world) {
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(new Vector2(Constants.GROUND_X, Constants.GROUND_Y));
        Body body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(Constants.GROUND_WIDTH / 2, Constants.GROUND_HEIGHT / 2);
        body.createFixture(shape, Constants.GROUND_DENSITY);
        body.setUserData(new GroundUserData());
        shape.dispose();
        return body;
    }

    public static Body createCircle(World world) {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(new Vector2(Constants.CIRCLE_X, Constants.CIRCLE_Y));
        CircleShape shape = new CircleShape();
        shape.setRadius(Constants.CIRCLE_RADIUS);
        Body body = world.createBody(bodyDef);
        body.createFixture(shape, Constants.CIRCLE_DENSITY);
        body.resetMassData();
        body.setUserData(new CircleUserData(Constants.CIRCLE_RADIUS));
        shape.dispose();
        return body;
    }

}
