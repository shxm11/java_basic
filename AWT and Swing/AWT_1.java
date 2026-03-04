import java.awt.*;
import javax.swing.*;

class myfirstform extends JFrame
{
	JLabel l1;
	JTextField t1;
	JButton b;
	myfirstform()
	{
		l1=new JLabel("Enter Name "); //Message displayed
		t1=new JTextField(20);        //Typing area
		b=new JButton("Click me");    //submit button
		
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(b);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[])
	{
		new myfirstform();
	}
}
