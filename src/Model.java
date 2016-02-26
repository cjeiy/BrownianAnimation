
class Model {
	//Simuleringstillstånd, en vektor med partiklar, kan läsas utifrån.
	
	static Integer quantityOfParticles = 10000;
	static Particle[] particle = new Particle[quantityOfParticles];
	static Integer ms = 10;
	
	Model(){
		//Skapar partiklarna
		
		for (int i = 0; i<quantityOfParticles;i++){
			particle[i] = (new Particle((View.panelWidth/2) + 10*(Math.random() - Math.random()) ,(View.panelHeight/2)+ 10*(Math.random() - Math.random())));}
		
	}
	
	Model(int b){
		for (int i = 0; i<quantityOfParticles;i++){
			particle[i] = new Particle(View.panelWidth/2, View.panelHeight/2);
			}
		
	}
	
	Model(Double b){
		for (int i = 0; i<quantityOfParticles;i++){
			particle[i] = new Particle();
			}
		
	}
	void moveAll(){
		//utför slumpförflyttning av alla parktilar
		
		for (int i = 0; i<quantityOfParticles; i++)
			particle[i].randomMove();
	}
	
	
	void setL(int value){
		Particle.L = value;
		//Ändrar partiklarna flyttsträcka L
	}
	
	void setTimeStep(int ms){
		this.ms = ms;

		
	}

}
