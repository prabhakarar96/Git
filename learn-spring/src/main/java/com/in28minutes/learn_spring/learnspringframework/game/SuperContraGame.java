package com.in28minutes.learn_spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

public void down() {
        System.out.println("Sit down");
    }

public void left() {
        System.out.println("Go back");
    }

public void right() {
        System.out.println("Shoot a bullet");
}
}
