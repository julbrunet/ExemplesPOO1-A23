package semaine11.exemples_corriges.animaux;

/**
 * Ajouter une position accessible de l'exterieur en lecture et ecriture
 * Ajouter une vitesse accessible qu'en lecture (Doit etre entre 0 et 10 m/s)
 * Ajouter une methode avancer (int tempsEnSecondes) qui modifies la position en tenant compte de la vitesse et du temps
 * Tester
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public class Animal {

    //Attribut qui contient l'espece de l'animal
    private String espece;

    //Attribut qui contient la taille de l'animal
    private double poids;

    private double position;


    private double vitesse;

    /**
     * @param espece
     * @param poids
     * @param vitesse
     */
    public Animal(String espece, double poids, double vitesse,int position) {
        this.espece = espece;
        this.poids = poids;
        //Ici on utilise le setter pour profiter de la validation,
        // mais il faut être prudent avec ce genre d'appels.
        // L'objet est en construction, donc potentiellement pas encore complétement initialisé.
        setVitesse(vitesse);
        this.position = position;
    }


    public void decrire() {
        StringBuilder txte = new StringBuilder();
        for (int i = 0; i < position; i++) {
            txte.append(".");
        }
        txte.append(espece).append("(").append(poids).append(" kg, ").append(vitesse).append(" m/s)");
        System.out.println(txte);
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

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPosition() {
        return position;
    }

    private void setPosition(double position) {
        this.position = position;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {

        if(vitesseValide(vitesse) ){
            this.vitesse = vitesse;
        }
        else{
            System.out.println(vitesse + " [m/s] n'est pas une valeur valide pour la vitesse.");
        }
    }

    private boolean vitesseValide(double vitesse) {
        return (0 < vitesse && vitesse <=10) ;

    }


    public void avancer(int tempsSecondes) {
        double distance = vitesse * tempsSecondes;
        setPosition(position + distance);
    }

}
