import java.applet.Applet;
import java.awt.Graphics;

public class P_applet extends Applet {
    public void paint(Graphics g) {
        // Display the welcome message
        g.drawString("Welcome to Java Applets!", 50, 60);
    }
}
