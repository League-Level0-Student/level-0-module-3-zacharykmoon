
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		
		//4. Ask the user what color pen they would like the robot to draw with
		 String input = JOptionPane.showInputDialog("pick a colorfor the robot trail");
				 if(input.equals("red")) {
					 rob.setPenColor(Color.RED);
					
					 
				 }
				 if(input.equals("orange")) {
					 rob.setPenColor(Color.ORANGE);
					 
				 }
				 
				 if(input.equals("yellow")) {
					 rob.setPenColor(Color.YELLOW);
				 }
				 if(input.equals("green")) {
					 rob.setPenColor(Color.GREEN);
					 if(input.equals("blue")) {
						 rob.setPenColor(Color.BLUE);
					 }
					 if(input.equals("magenta")) {
						 rob.setPenColor(Color.MAGENTA);
					 }
					 if(input.equals("pink")) {
						 rob.setPenColor(Color.PINK);
					 }
			 
			 
			 
				 }
			 
			 
			 
		
		
		 
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		
		 rob.setSpeed(50);
			rob.penDown();
			 rob.move(50);
			 rob.turn(90);


	}
}
