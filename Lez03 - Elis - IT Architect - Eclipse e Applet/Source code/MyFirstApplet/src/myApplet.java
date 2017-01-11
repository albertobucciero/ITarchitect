import java.awt.*;
import java.applet.Applet;


public class myApplet extends Applet {

	Label t;
	public void init() {
		t=new Label("Ciao mondo!");
	add(t);
	}
	public void start() {
		setBackground(Color.green);
		setForeground(Color.red);
		repaint();
	}
}
