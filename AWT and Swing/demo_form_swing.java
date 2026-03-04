import java.awt.*;
import javax.swing.*;

class FrameDemo extends JFrame
{
	FrameDemo()
	{
		setTitle("My first Form");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[])
	{
		new FrameDemo();
	}
}