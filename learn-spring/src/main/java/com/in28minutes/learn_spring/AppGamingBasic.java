package learn-spring.src.main.java.com.in28minutes.learn_spring;

public class AppGamingBansic {
public static void main(String[] args) {
    var marioGame= new MarioGame();  
    var gameRunner = new GameRunner(marioGame);
    gameRunner.run();
    }
}
