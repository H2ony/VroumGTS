/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anthony
 */
public class Horloge {
    private int heures;
    private int minutes;
    private int secondes;
    private long tempsDepart;
    private long tempsSauv;
    
    public Horloge(){
        tempsSauv = 0;
    }
    public void demarrer(){
        tempsDepart = System.currentTimeMillis();
    }
    
    public void stoper(){
        long tempsInter;
        tempsInter = System.currentTimeMillis();
        tempsSauv = tempsSauv + (tempsInter - tempsDepart);
    }
    
    public void reprendre(){
        tempsDepart = System.currentTimeMillis();
    }
    
    public String getTemps(){
        long tempsInter;
        tempsInter = System.currentTimeMillis();
        tempsSauv = tempsSauv + (tempsInter - tempsDepart);
        tempsSauv = tempsSauv /1000;
        this.heures = (int) (tempsSauv / 3600);
        tempsSauv = (int) (tempsSauv % 3600);
        this.minutes = (int) (tempsSauv / 60);
        tempsSauv = (int) (tempsSauv % 60);
        this.secondes = (int) tempsSauv;
        
        return Integer.toString(this.heures)+":"+Integer.toString(this.minutes)+":"+Integer.toString(this.secondes);
    }
}
