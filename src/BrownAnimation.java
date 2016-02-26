import java.awt.*;

import javax.swing.JFrame;


class BrownAnimation extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5378776322000731130L;
	
	static View viewPanel = new View();
	static UserInteraction gui = new UserInteraction();
	
	BrownAnimation(){
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(1000, 1000));
        this.setVisible(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        
        this.add(viewPanel);
        this.add(gui);
 
        
		this.pack();
   
        
        
        
		//Skapar några ansvarsområden och visar två av dem i fönstret
		// Sätt layoutmanager, storlek och annat som behövs
		
	}
	public static void main(String[] args) {
		// Skapar objektet av BrownAnimation

		BrownAnimation brownTest = new BrownAnimation();
		Double a = 1.0;
		int b = 1;
		
		Model m = new Model(b);

		Simulation s = new Simulation(m, viewPanel);
	
		

	}

}
