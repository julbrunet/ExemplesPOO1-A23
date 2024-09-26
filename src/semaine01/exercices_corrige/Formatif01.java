package semaine01.exercices_corrige;

/**
 * Formatif01
 *
 * @author Julien.Brunet
 * @since 2023-08-23
 */
public class Formatif01 {

    private void afficherTout() {
        afficherLigne();
        afficherMesInfos();
        afficherLigne();
        afficherSomme1a6();
        afficherLigne();
        calculerEtAfficher0CelsiusEnFarenheit();
        afficherLigne();
        calculerEtAfficher0FarenheitEnCelsius();
        afficherLigne();
        calculerEtAfficher2KmVersMetre();
        afficherLigne();
        calculerEtAfficher212metresVersKm();
        afficherLigne();
    }

    public static void main(String[] args) {
        System.out.println("Debut du programme");
        Formatif01 programme = new Formatif01();
        programme.afficherTout();
    }

    public void afficherLigne() {
        System.out.println("******************************");
    }

    public void afficherMesInfos() {
        System.out.println("Nom : Julien Brunet");
        System.out.println("Lieu de naissance : Lausanne");
    }


    public void afficherSomme1a6(){
        int somme = 1+2+3+4+5+6;
        System.out.println("la somme des nombres de 1 � 6 est : " + somme);
    }

    public void calculerEtAfficher0CelsiusEnFarenheit() {
        double celsius = 0;
        double f = celsius * 9.0 / 5 + 32;
        System.out.println(celsius + " Celsius en Farenheit est : " + f);
    }

    public void calculerEtAfficher0FarenheitEnCelsius() {
        double fahrenheit = 0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Farenheit en Celsius est : " + celsius);
    }

    public void calculerEtAfficher2KmVersMetre() {
        int km = 212;
        int metres = km * 1000;
        System.out.println(km + " km en metres est : " + metres);
    }

    public void calculerEtAfficher212metresVersKm() {
        double metres = 2;
        double km = metres / 1000;
        System.out.println(metres + " metres en km est : " + km);
    }
}
