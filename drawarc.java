import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class drawarc extends JFrame
{
	//constructor
	public drawarc()
	{
		setTitle("draw arc");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//draw method
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.drawArc(x,y,with,height,start angle, arc range);
		g.drawArc(100,100,200,200,0,45);
	}

	//main method
	public static void main(String[] args) {
		drawarc obj = new drawarc();
	}

}