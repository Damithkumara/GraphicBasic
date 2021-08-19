import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class drawovel extends JFrame
{
	//constructor
	public drawovel()
	{
		setTitle("draw ovel");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//drawing method
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.drawOvel(top-left-x,top-left-y,width,height);
		g.drawOval(150,150,50,50);
	}

	//main method
	public static void main(String[] args) {
		drawovel obj = new drawovel();
	}

}