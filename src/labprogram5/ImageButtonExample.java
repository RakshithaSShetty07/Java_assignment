/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass  is pressed” depending upon the Jbutton with image  either  Digital Clock or  Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).*/
package labprogram5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel l1;

    ImageButtonExample() {

        JFrame f = new JFrame("Image Click Example");

        // Message Label
        l1 = new JLabel();
        l1.setBounds(100, 30, 400, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 20));

        // Load Images
        ImageIcon clockIcon = new ImageIcon("images/clock.png");
        ImageIcon hourglassIcon = new ImageIcon("images/hourglass.png");

        // Create buttons with images ONLY
        JButton clockBtn = new JButton(clockIcon);
        JButton hourglassBtn = new JButton(hourglassIcon);

        // Remove button borders (optional for clean look)
        clockBtn.setBorder(null);
        clockBtn.setContentAreaFilled(false);

        hourglassBtn.setBorder(null);
        hourglassBtn.setContentAreaFilled(false);

        // Set positions
        clockBtn.setBounds(50, 100, 150, 150);
        hourglassBtn.setBounds(250, 100, 150, 150);

        // Action for Clock Image
        clockBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        // Action for Hourglass Image
        hourglassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(l1);
        f.add(clockBtn);
        f.add(hourglassBtn);

        f.setSize(450, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}