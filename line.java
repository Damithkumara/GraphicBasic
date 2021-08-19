import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class line extends JFrame
{
	//constructor
	public line()
	{
		setTitle("draw line");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//drawing method
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.drawLine(x-start,y-start,x-end,y-end);
		g.drawLine(100,100,300,300);
	}

	//main method
	public static void main(String[] args)
	{
		line obj = new line();
	}
}