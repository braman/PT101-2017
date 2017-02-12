import javax.swing.JFrame;

public class Figures  {
	
	public static void main(String args[]) {
		DrawPanel panel = new DrawPanel();
			
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add(panel);
		frame.setSize( 250, 250 );
		
		frame.setVisible(true);
		
	}
	
}
