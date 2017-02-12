import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width  = getWidth();
		int height = getHeight();
		
		int x = 0;
		int y = height;
		
		while (x <= width || y >= 0) {
			g.drawLine(0, 0, x, y);	
			x = x + 10;
			y = y - 10;
		}
	}	

}
