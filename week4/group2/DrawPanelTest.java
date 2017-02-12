import javax.swing.JFrame;

class DrawPanelTest {
	
	public static void main(String ... args) {
		
		// DrawPanel panel = new DrawPanel();
		DrawLines panel = new DrawLines();
		
		JFrame frame = new JFrame();
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		
		frame.setVisible(true);
		
	}
	
} 
