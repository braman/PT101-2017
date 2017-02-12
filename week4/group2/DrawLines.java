import java.awt.Graphics;
import javax.swing.JPanel;

class DrawLines extends JPanel {
	
	
	public void drawRect(Graphics g, int x0, int y0, 
		int width, int height) {
				
		
		g.drawLine(x0, y0, x0 + width, y0);
		g.drawLine(x0, y0, x0, y0 + height);
		
			
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int height = getHeight();
		int width  = getWidth();

		int x = 0;
		int y = height;
		
		drawRect(g, 10, 10, 100, 100);

		/*
		while (x <= width || y >= 0) {
			g.drawLine(0, 0, x, y);
			x = x + 10;
			y = y - 10;
		}
		*/

	}
} 
