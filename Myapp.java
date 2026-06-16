import javax.swing.*;
import java.awt.*;

class Myapp {
    public static void main(String[] args) {
        JFrame fr = new JFrame("My APP");
        fr.setSize(600,200);
        fr.setLocationRelativeTo(null); //frame to appear at the CENTER of the screen

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setVisible(true);  //To make frame visible
    }
}
