import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class m9p1 extends Applet{
	
	public void paint(Graphics g){
		g.setColor(Color.blue);	
		setBackground(Color.red);	
		g.drawString("Hello World",30,180);
	}
}
