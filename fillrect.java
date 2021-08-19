import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class fillrect extends JFrame
{
	//constructor
	public fillrect()
	{
		setTitle("fill rectangle");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//draw method
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		//g.fillRect(top-left-x,top-left-y,width,height);
		g.fillRect(150,150,100,100);
	}

	//main method
	public static void main(String[] args) {
		fillrect obj = new fillrect();
	}
}