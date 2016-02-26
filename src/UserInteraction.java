import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.event.*;

import javax.swing.JPanel;

class UserInteraction extends JPanel implements ActionListener, AdjustmentListener, Runnable{
		
		Button startButton;
		Button pauseButton;
		Scrollbar scrollForLength;
		Scrollbar scrollForTime;
		
		int defaultTimeStepMS = Model.ms;
		int minTimeStepMS = ((Double)(Model.ms*0.1)).intValue();
		int maxTimeStepMS = Model.ms*2;
		
		int defaultLength = Particle.L;
		int minLength = ((Double)(Particle.L*0.1)).intValue();
		int maxLength = Particle.L*2;
	
	UserInteraction(){
		this.setPreferredSize(new Dimension(150, 250));
	    this.setVisible(true);
	    this.setBackground(Color.DARK_GRAY);
		
        scrollForTime = new Scrollbar(Scrollbar.VERTICAL, defaultTimeStepMS, 1, minTimeStepMS, maxTimeStepMS);
        scrollForLength = new Scrollbar(Scrollbar.VERTICAL, defaultLength, 1, minLength, maxLength);
        
        startButton = new Button("Start");
        pauseButton = new Button("Pause");
        
        this.add(startButton);
        this.add(pauseButton);
       
        this.add(scrollForTime);
        this.add(scrollForLength); 
        
		startButton.addActionListener(this);
		pauseButton.addActionListener(this);
		scrollForLength.addAdjustmentListener(this);
		scrollForTime.addAdjustmentListener(this);		
		}
        
	

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		if((Scrollbar)e.getSource() == scrollForLength)
			Simulation.model.setL(40 - e.getValue());
			
		
		if((Scrollbar)e.getSource() == scrollForTime)
			Simulation.model.setTimeStep(e.getValue());	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		System.out.println("KNAPP");
		System.out.println(e);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		
	}
}


