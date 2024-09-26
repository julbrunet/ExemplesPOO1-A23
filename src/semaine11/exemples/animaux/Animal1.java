package semaine11.exemples.animaux;

public class Animal1 {
    public String espece;

    public double poids;

    public void decrire() {
        System.out.println(espece + " pesant " + poids + " kg.");
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "espece='" + espece + '\'' +
                ", poids=" + poids +
                '}';
    }
}
