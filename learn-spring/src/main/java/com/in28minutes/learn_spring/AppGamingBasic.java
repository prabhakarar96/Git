//Created on 4/8/2025
package com.in28minutes.learn_spring;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

public class AppGamingBasic {
public static void main(String[] args) {
    var marioGame = new MarioGame();
    var gameRunner = new GameRunner(marioGame);
    gameRunner.run();
}
}
