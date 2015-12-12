package com.upnadam.game.States;

import java.util.Stack;
/**
 * Created by Adam on 12/12/2015.
 */
public class GameStateManager {

    private Stack<State> states;

    public GameStateManager(){
        states = new Stack<State>();
    }

    //pushes an item to the top of thestack
    public void push(State state){
        states.push(state);
    }

    //Pops (removes) the top visible state in the stack
    public void pop(){
        states.pop();
    }

    //If we want to set a state, we need to pop current and push what we want on top
    public void set(State state){
        states.pop();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update();
    }

}
