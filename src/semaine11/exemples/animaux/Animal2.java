package semaine11.exemples.animaux;

public class Animal2 {
    private String espece;

    private double poids;


    public Animal2(String espece, double poids) {
        this.espece = espece;
        this.poids = poids;
    }

    public void decrire() {
        System.out.println(espece + " pesant " + poids + " kg.");
    }
}
