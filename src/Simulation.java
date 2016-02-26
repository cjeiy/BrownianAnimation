import java.sql.Time;
import java.util.Timer;

class Simulation extends Thread {
		
		static View view;
		static Model model;
		
	Simulation(Model m, View v){
		view = v;
		model = m;
	
		run();
		
		// Sparar referenser till objekten m och v samt startar simuleringen
	}
	
	public void run(){
		
		
		Thread userThread = new Thread(BrownAnimation.gui);
		userThread.start();
		
		moveAndDrawParticles();
	}
	
	void moveAndDrawParticles(){
		for(int i=0; i < 1000; i++){
		view.drawParticles();
		model.moveAll();
		try {
			sleep(model.ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
	
		
		
	}

}

