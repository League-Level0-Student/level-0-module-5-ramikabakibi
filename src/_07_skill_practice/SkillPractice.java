package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			SkillPractice skills = new SkillPractice();
			          	skills.skill1();
			          	skills.skill2();
			          	skills.skill3();
			          	skills.skill4();
			          	skills.skill5();
			}

			void skill1() {
			 //Use pop-ups for the following.
			// Ask the user how many dimes they have

String answer= JOptionPane.showInputDialog("How many dimes do you have?");


			// Tell them how many cents they have (hint multiply by 10)
int i=Integer.parseInt(answer);
JOptionPane.showMessageDialog(null, "You have "+i*10+" cents" );

			// Ask the user how tall they are (inches)

	String inches=JOptionPane.showInputDialog("How tall are you in inches?");
	int s=Integer.parseInt(inches);

			// If they are shorter than 36 inches, tell them to eat their Wheaties
if(s<36) {
JOptionPane.showMessageDialog(null, "YOU NEED TO EAT YOUR WHEATIES");
}
else if(s>=36){
	JOptionPane.showMessageDialog(null, "You are tall my guy");
}



			}

			void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int i=1;i<30;i++) {
	if(i%3==0) {
		System.out.println(i);
	}
	
	}
}





			

			void skill3() { // Get a random number that is less than 20 and print it to the console 
Random rand=new Random();
int i=rand.nextInt(20);
System.out.println(i);

			// Get another random number that is less than 10 and print it to the console 
int s=rand.nextInt(10);
System.out.println(s);

			// Using a pop-up, tell the user the difference between the numbers // Hint: use subtract
int k=i-s;
JOptionPane.showMessageDialog(null, "The difference between the random numbers is " + k);

			}

			void skill4() { // In a pop-up, ask the user for the city they live in 

String answer=JOptionPane.showInputDialog(null, "What city do you live in?");

			// If they answered "San Diego", tell them they live in America's Finest City 
if(answer.equals("San Diego")){
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "Such a shame. MOVE THERE");
}

			// Otherwise, tell them to move to San Diego 



			// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars=JOptionPane.showInputDialog("How many cars does your family have?");
int i=Integer.parseInt(cars);
if(i==0) {
	JOptionPane.showMessageDialog(null, "You probably use public transportation");
}
else if(i==1) {
	String s=JOptionPane.showInputDialog("What's your model of car?");
	JOptionPane.showMessageDialog(null, s);
}
else if(i>1) {
	int l=i*4;
	JOptionPane.showMessageDialog(null, "Your cars have "+l+"wheels altogether");
}
			// If there is 1 car, use a pop-up to display the make/model of the car 



			// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



			}

			void skill5() { // In a pop-up, ask the user for the name of their school 

String answer=JOptionPane.showInputDialog("What is the name of your school?");

			// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, answer+" is a fantastic school");

			}
			
	}


