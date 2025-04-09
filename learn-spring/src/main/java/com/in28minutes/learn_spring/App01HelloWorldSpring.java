//Created on 4/8/2025
package com.in28minutes.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring.learnspringframework.game.HelloWorldConfig;

public class App01HelloWorldSpring {
public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
}
}
