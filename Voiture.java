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
			{ enCourse = false; 
			  System.out.println("Il semblerai qu'il y ai un problème avec la voiture de "+pilote.nom+" "+pilote.prenom+".\n"+ "Il est hors course maintenant");}
				
	}
	
	public void remplirReservoir() {
	
		reservoir = capaciteReservoir;
		System.out.println("La voiture de "+pilote.nom+" est ravitaillée");
		
	}
	
	public void depassement(Voiture v) {
		
		int a = (int)(Math.random()*101);
		
		if(a<=50)
			{ enCourse = false;
			  v.enCourse = false;
			  System.out.println("Oh la la ! "+pilote.nom+" vient de percuter violament "+v.pilote.nom+ " ! \nIls sont tous les deux hors course."); }
		else
			{ System.out.println("Joli depassement bien propre de "+pilote.nom+".");}
	}
		
	
	
	public static void main(String[] args) {
		
		Voiture v = new Voiture(new Pilote("Angeloni", "Julien", 0), 0507, 3.0, 50.0, 9.0, 3.0, 80, 0, true);
		Voiture a = new Voiture(new Pilote("Bonnet", "Emilien", 0), 0507, 3.0, 50.0, 9.0, 3.0, 80, 0, true);
		
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
		
		//Test depassement
		
		v.depassement(a);
		
		

}
		
	

}
