package com.upnadam.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.upnadam.game.RunIndyGame;

/**
 * Created by Adam on 12/12/2015.
 */
public class PlayState extends State {
    private Texture dog;
    private Texture background;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        dog = new Texture("Dog.png");
        background = new Texture("Background.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
    sb.begin();
        sb.draw(background, 0, 0, RunIndyGame.WIDTH, RunIndyGame.HEIGHT);
        sb.draw(dog, 50, 150);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
