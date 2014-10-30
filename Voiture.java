public class Voiture {
	
	Pilote pilote;
	int code;
	double vitesse;
	double capaciteReservoir;
	double reservoir;
	double conso;
	int fiabilite;
	double position;
	boolean enCourse;
	
	
	public Voiture(Pilote pilote, int code, double vitesse, double capaciteReservoir, double reservoir,  double conso, int fiabilite, double position, boolean enCourse) {
		
		this.pilote = pilote;
		this.code = code;
		this.vitesse = vitesse;
		this.capaciteReservoir = capaciteReservoir;
		this.reservoir = reservoir;
		this.conso = conso;
		this.fiabilite = fiabilite;
		this.position = position;
		this.enCourse = enCourse;
	}
	
	
	public void estFiable() {
		
		int a = (int)(Math.random()*101);
		
		if(a >= fiabilite)
			{ enCourse = false; }
				
	}
	
	public void remplirReservoir() {
	
		reservoir = capaciteReservoir;
		
	}
	
		
	
	
	public static void main(String[] args) {
		
		Voiture v = new Voiture(new Pilote("Angeloni", "Julien", 0), 0507, 3.0, 50.0, 9.0, 3.0, 80, 0, true);
		
		//Test fiabilité
		
		v.estFiable();
		System.out.println(v.enCourse);
		v.enCourse = true;
		
		v.estFiable();
		System.out.println(v.enCourse);
		v.enCourse = true;
		
		v.estFiable();
		System.out.println(v.enCourse);
		v.enCourse = true;
		
		v.estFiable();
		System.out.println(v.enCourse);
		v.enCourse = true;
		
		//Test remplir le reservoir
		
		v.reservoir = 0;
		v.remplirReservoir();
		System.out.println(v.reservoir);

}
		
	

}
