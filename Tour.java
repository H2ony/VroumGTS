public class Tour {

	Voiture classTour[];
	
	public Tour() {
		
		this.classTour = new Voiture[20];
	}
        
        public void ajouterTour(int numeroVoiture, int tour){
            this.classTour[numeroVoiture-1]= tour;
        }
	
}
	
