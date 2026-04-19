/*Develop a simple swing program for illustrating mouse operations such as mouse down, up double click , single click with help of a button
*/


package labprogram5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends JFrame implements MouseListener {

	    JButton btn;
	    JLabel l1;

	    MouseDemo() {

	        setTitle("Mouse Operations Demo");

	        btn = new JButton("Click Me!");
	        btn.setBounds(100, 100, 120, 50);

	        l1 = new JLabel();
	        l1.setBounds(50, 200, 300, 50);
	        l1.setFont(new Font("Arial", Font.BOLD, 16));

	        btn.addMouseListener(this);

	        add(btn);
	        add(l1);

	        setSize(350, 350);
	        setLayout(null);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public void mouseClicked(MouseEvent e) {
	        if (e.getClickCount() == 2)
	            l1.setText("Double Click on Button");
	        else
	            l1.setText("Single Click on Button");
	    }

	    public void mousePressed(MouseEvent e) {
	        l1.setText("Mouse Pressed (Down)");
	    }

	    public void mouseReleased(MouseEvent e) {
	        l1.setText("Mouse Released (Up)");
	    }

	    public void mouseEntered(MouseEvent e) {
	        l1.setText("Mouse Entered Button");
	    }

	    public void mouseExited(MouseEvent e) {
	        l1.setText("Mouse Exited Button");
	    }

	    public static void main(String[] args) {
	        new MouseDemo();
	    }
	
}
