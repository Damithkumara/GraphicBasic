import javax.swing.*;

public class framecreate extends JFrame
{
	//constructor
	public framecreate()
	{
		setTitle("create window");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// main method
	public static void main(String[] args) {
		framecreate obj = new framecreate();
	}

}