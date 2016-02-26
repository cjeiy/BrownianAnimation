import java.util.ArrayList;



class Particle {
	//partikelns Läge
	Double x,y;
	static int L = 6;
	
	//Rörlig eller ej, rörlig från början
	boolean isMoving = true;
	
	Particle(){
		x = Math.random()*(View.panelWidth);
		y = Math.random()*(View.panelHeight);
		//Slumpa startpositionen
	}
	
	Particle(double xs, double ys){
		x = xs;
		y = ys;
		//Sätter startpositionen till (xs,ys)
	}
	
	void randomMove(){
		if(isMoving){
		Double randomAngle = Math.random()*360;
		x += L*Math.cos(randomAngle);
		y += L*Math.sin(randomAngle);
		
		checkForWallCollision();
		}
		
		//Ändrar partikelns position
	}
	
	void checkForWallCollision(){
		if(x.intValue() <= 0){
			x = 0.0;
			isMoving=false;
		}
		if(x.intValue() >= View.panelWidth){
			isMoving=false;
			
			x = (double)View.panelWidth-2.0;
		}
			
		if(y.intValue() <= 0){
			y = 0.0;
			isMoving=false;
		}
		if(y.intValue() >= View.panelHeight){
			isMoving=false;
			y = (double)View.panelHeight-2.0;
		}
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
		System.out.println(Math.random());
		}
	}

}
