import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class filloval extends JFrame
{
	//constructor
	public filloval()
	{
		setTitle("fill oval");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//drawing method
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		//g.fillOval(top-leftx,top-left-y,width,height);
		g.fillOval(150,150,100,100);
	}

	//main method
	public static void main(String[] args) {
		filloval obj = new filloval();
	}
}