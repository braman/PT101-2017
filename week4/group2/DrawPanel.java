import java.awt.Graphics;
import javax.swing.JPanel;

class DrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int height = getHeight();
		int width  = getWidth();
		
		//---------x--y---x-------y
		g.drawLine(0, 0, width, height);
		
		g.drawLine(width, 0, 0, height);
		
	}
	
} 
