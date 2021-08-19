import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class fillarc extends JFrame
{
	//constructor
	public fillarc()
	{
		setTitle("fill arc");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//draw method
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		//g.fillArc(x,y,width,height,start angle, arc arngle );
		g.fillArc(150,150,100,100,0,90);
	}

	//main method
	public static void main(String[] args) {
		fillarc obj = new fillarc();
	}
}