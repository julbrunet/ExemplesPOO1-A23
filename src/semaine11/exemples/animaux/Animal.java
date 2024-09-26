package semaine11.exemples.animaux;

public class Animal {
    private String espece;

    private double poids;

    private int position = 0;

    private double vitesse = 0;

    public Animal(String espece, double poids) {
        this.espece = espece;
        this.poids = poids;

    }

    public String getEspece() {
        return espece;
    }

    private void setEspece(String espece) {
        this.espece = espece;
    }

    public double getPoids() {
        return poids;
    }

    private void setPoids(double poids) {
        this.poids = poids;
    }

    public int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position = position;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        if(isVitesseValide(vitesse)) {
            this.vitesse = vitesse;
        }

    }

    private boolean isVitesseValide(double vitesse) {
        return 0 <= vitesse && vitesse <=10;
    }

//
//  //  public void decrire() {
//        System.out.println(espece + " pesant " + poids + " kg. Position: " + position);
//    }

    public void avancer(int tempsSecondes){
        //il avance, donc change sa position en fonction de sa vitesse d = v*t
        position+=vitesse*tempsSecondes;

    }

    public String toString() {
        return espece + " pesant " + poids + " kg. Position: " + position;
    }
}
