import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



class View extends JPanel{

	static int panelHeight = 600;
	static int panelWidth = 600;
	
	View(){
		this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setVisible(true);
        this.setBackground(Color.WHITE);
		
	}
	
	public void drawParticles(){
		super.paint(getGraphics());
		
		for(int i = 0; i< Model.quantityOfParticles; i++){
			getGraphics().setColor(Color.CYAN);
			getGraphics().drawLine((Model.particle[i].x).intValue(), (Model.particle[i].y).intValue(), Model.particle[i].x.intValue(), Model.particle[i].y.intValue());	
		}
		
	}
	
	

}