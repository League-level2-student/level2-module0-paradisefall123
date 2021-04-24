package arrays;

import org.jointheleague.graphical.robot.Robot;

import java.util.Random;

public class _01_RobotRace {
    public static void main(String[] args){
        Robot[] robos= createRobots(3);
        placeAtStartPosition(robos);
        startRace(robos);
    }
    //1. make a main method
    public static void oldMain(String[] args) {
        //2. create an array of 5 robots.
        Robot[] robos = new Robot[5];
        //3. use a for loop to initialize the robots.
        for (int i = 0; i < robos.length; i++) {
            robos[i] = new Robot();

        }
        //4. make each robot start at the bottom of the screen, side by side, facing up
        int xposition = 100;
        int yposition = 550;
        for (int i = 0; i < robos.length; i++) {
            xposition = xposition + (140);
            robos[i].setX(xposition);
            robos[i].setY(yposition);

        }


        //5. use another for loop to iterate through the array and make each robot move
        //   a random amount less than 50.
        moveRobot(robos);
        //6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
        boolean top = false;
        while (!top) {
            moveRobot(robos);
            top = checkRobots(robos);
        }

        //7. declare that robot the winner and throw it a party!
        Robot winner = checkWinner(robos);
        winner.sparkle();

        //8. try different races with different amounts of robots.
        //9. make the robots race around a circular track.
    }
    public static void moveRobot(Robot[] robos) {
     //  moveRobotUp(robos);
       moveRobotCircle(robos);
    }
    public static void moveRobotUp(Robot[] robos) {
        Random forward = new Random();

        for (int i = 0; i < robos.length; i++) {

            robos[i].move(forward.nextInt(49));
            robos[i].setSpeed(30);
        }

    }
    public static void moveRobotCircle(Robot[] robos) {
   Random speed=new Random();
   Random move=new Random();
        for (int i = 0; i < robos.length; i++) {
            int randSpeed= speed.nextInt(100);
            robos[i].setSpeed(randSpeed);
            robos[i].move(move.nextInt(40));
            robos[i].turn(10);

        }

    }
    public static boolean checkRobots(Robot[] robos) {
        boolean top = false;
        int toppos = 65;
        for (int i = 0; i < robos.length; i++) {
            if (robos[i].getY() <= toppos) {
                //checking if robots y postion is less than or equal to top
                top = true;
            }

        }
        return top;
    }

    public static Robot checkWinner(Robot[] robos) {
        //check which robo reached the top first
        // iterate through robos to find which one reached toppos
        //toppos is the top of the screen-0
        //get robo position.  What do I use to get the robos position?
        //Compare robot position with top position if it's equal to or less than
        //return robot
        int toppos = 65;
        for (int i = 0; i < robos.length; i++) {
            if (robos[i].getY() <= toppos) {
                return robos[i];
            }
        }
        return null;
    }

    public static Robot[] createRobots(int numRobots) { //convey a message
        Robot[] robos = new Robot[numRobots];
        for (int i = 0; i < robos.length; i++) {
            robos[i] = new Robot();
        }

        return robos;
    }

    public static void startRace(Robot[] robos) {

        boolean top = false;
        while (!top) {
            moveRobot(robos);
            top = checkRobots(robos);
        }
        Robot winner = checkWinner(robos);
        winner.sparkle();
    }

    public static void placeAtStartPosition(Robot[] robos) {
      //  int xposition = 100;
       // int yposition = 550;
        int yposition=400;
        int xposition=50;
        for (int i = 0; i < robos.length; i++) {
            xposition = xposition + (140);
            robos[i].setX(xposition);
            robos[i].setY(yposition);

        }

    }

}
