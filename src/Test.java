import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Test extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 001;
	
	public Test() {
        this.setPreferredSize(new Dimension(400, 400));
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // define the position
        int locX = 200;
        int locY = 200;

        // draw a line (there is no drawPoint..)
        g.drawOval(locX, locY, 2, 2); 
    }

    public static void main(String[] args) {
        Test test = new Test(); 
    }
}