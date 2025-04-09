//Created on 4/8/2025
package com.in28minutes.learn_spring;

import com.in28minutes.learn_spring.learnspringframework.game.GameRunner;
import com.in28minutes.learn_spring.learnspringframework.game.MarioGame;
import com.in28minutes.learn_spring.learnspringframework.game.SuperContraGame;  
import com.in28minutes.learn_spring.learnspringframework.game.GamingConsole;
import com.in28minutes.learn_spring.learnspringframework.game.Pacman;
public class AppGamingBasic {
public static void main(String[] args) {
    //var game = new MarioGame();
    //var game = new SuperContraGame();
    var game = new Pacman();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
}
}
