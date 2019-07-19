package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog( "How many hours a week do you code");
	
int i=Integer.parseInt(answer);
if(i<=2) {
	JOptionPane.showMessageDialog(null, "Bruh get off YouTube and start coding");
}
if(i>=3 && i<=5) {
	JOptionPane.showMessageDialog(null, "You're a code ninja my dude");
}
if(i>5) {
	playBatmanTheme();
}
}
	// 1. Ask the user how many hours they spent coding this week.


	

	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the method below to play the Batman theme song.

	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}