package com.in28minutes.learnspringframework.game;

public class GameRunner {
    private SuperContraGame game;
    public GameRunner(SuperContraGame superContraGame) {
        this.game = superContraGame;
    }
public void run() {
        System.out.println("Running the game " + game);
        game.up();
        game.down();
        game.left();
        game.right();    
    } 
}
