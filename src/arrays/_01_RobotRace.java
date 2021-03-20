package arrays;

import org.jointheleague.graphical.robot.Robot;

import java.util.Random;

public class _01_RobotRace {
	//1. make a main method
    public static void main(String[] args) {


        //2. create an array of 5 robots.
        Robot[] robos= new Robot[5];
        //3. use a for loop to initialize the robots.
        for(int i=0; i< robos.length;i++){
            robos[i]=new Robot();
        }
        //4. make each robot start at the bottom of the screen, side by side, facing up
        int xmove=100;
        int ymove=550;
        for(int i=0; i< robos.length;i++){
         xmove=xmove+(140);
         robos[i].setX(xmove);
         robos[i].setY(ymove);

        }


        //5. use another for loop to iterate through the array and make each robot move
        //   a random amount less than 50.
        Random forward= new Random();

        for(int i=0; i< robos.length;i++){

            robos[i].move(forward.nextInt(49));
            robos[i].setSpeed(30);
        }
        //6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
         while(){

    }
        //7. declare that robot the winner and throw it a party!

        //8. try different races with different amounts of robots.

        //9. make the robots race around a circular track.
    }
}
