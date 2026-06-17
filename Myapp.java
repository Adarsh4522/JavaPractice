import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;

 
class Myapp {
    public static void main(String[] args) {
        JFrame fr = new JFrame("My APP");
        fr.setSize(600,200);
        fr.setLocationRelativeTo(null); //frame to appear at the CENTER of the screen

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Color clr = new Color(255,0,0); //RGB value
        //fr.getContentPane().setBackground(clr);

        ImageIcon ic = new ImageIcon("backdrop.jpg");
       JLabel lbl = new JLabel(ic); //to add image to label
       fr.setContentPane(lbl);

        // code to play audio
        try { 
      //  File ado = new File("cmd_j70_salsa.mp3");
       // AudioInputStream audio = AudioSystem.getAudioInputStream(ado);

        Clip clip = AudioSystem.getClip();
       // clip.open(audio);
        clip.start();

    }
    catch(Exception e) {
        System.out.println(e);
        // fr.setResizable(false); //to make frame non-resizable
        fr.setVisible(true);  //To make frame visible
    }
}
}


//options for close button
//1. JFrame.EXIT_ON_CLOSE
//2. JFrame.DISPOSE_ON_CLOSE    
//3. JFrame.HIDE_ON_CLOSE
//4. JFrame.DO_NOTHING_ON_CLOSE