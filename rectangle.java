import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class rectangle extends JFrame
{
	//construtor
	public rectangle()
	{
		setTitle("rectangle");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//darw method
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		//g.drawRect(x-left-top,y-left-top,width,height);
		g.drawRect(150,150,200,200);
	}

	//main method
	public static void main(String[] args) {
		rectangle obj = new rectangle();
	}
}