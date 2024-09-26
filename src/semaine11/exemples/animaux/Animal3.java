package semaine11.exemples.animaux;

public class Animal3 {
    private String espece;

    private double poids;


    public Animal3(String espece, double poids) {
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

    public void decrire() {
        System.out.println(espece + " pesant " + poids + " kg.");
    }
}
