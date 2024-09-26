package semaine04.exemples.exemplecomplets;

public class Conditionnelles {
    public static void main(String[] args) {
        Conditionnelles conditionnelles = new Conditionnelles();

        System.out.println(" 2 est pair: " + conditionnelles.estPair(2));
        System.out.println(" 5 est pair: " + conditionnelles.estPair(5));


        System.out.println("2 est " + conditionnelles.verifierParite(2));
        System.out.println("5 est " + conditionnelles.verifierParite(5));


        System.out.println("2 est " + conditionnelles.verifierNombre(2));
        System.out.println("5 est " + conditionnelles.verifierNombre(5));
        System.out.println("0 est " + conditionnelles.verifierNombre(0));

        System.out.println("1 est " + conditionnelles.nommerJour(1));
        System.out.println("2 est " + conditionnelles.nommerJour(2));
        System.out.println("3 est " + conditionnelles.nommerJour(3));
        System.out.println("4 est " + conditionnelles.nommerJour(4));
        System.out.println("5 est " + conditionnelles.nommerJour(5));
        System.out.println("6 est " + conditionnelles.nommerJour(6));
        System.out.println("7 est " + conditionnelles.nommerJour(7));
        System.out.println("9 est " + conditionnelles.nommerJour(9));

        System.out.println("1 est " + conditionnelles.nommerFinDeSemaine(1));
        System.out.println("2 est " + conditionnelles.nommerFinDeSemaine(2));
        System.out.println("3 est " + conditionnelles.nommerFinDeSemaine(3));
        System.out.println("4 est " + conditionnelles.nommerFinDeSemaine(4));
        System.out.println("5 est " + conditionnelles.nommerFinDeSemaine(5));
        System.out.println("6 est " + conditionnelles.nommerFinDeSemaine(6));
        System.out.println("7 est " + conditionnelles.nommerFinDeSemaine(7));
        System.out.println("9 est " + conditionnelles.nommerFinDeSemaine(9));
    }

    /**
     * Vérifie si le nombre passé en parametre est pair
     * @param nombre le nombre a verifier
     * @return true si pair et false sinon...
     */
    public boolean estPair(int nombre) {
        boolean reponse = false;
        if (nombre % 2 == 0) {
            reponse = true;
        }
        return reponse;
        // ou en une seule instruction:
//         return nombre % 2 == 0;
    }

    /**
     * Retourne PAIR si le nombre est pair et IMPAIR sinon
     *
     * @param nombre le nombre a tester
     * @return PAIR ou IMPAIR
     */
    public String verifierParite(int nombre) {
        String parite;
        if (nombre % 2 == 0) {
            parite = "PAIR";
        }
        else {
            parite = "IMPAIR";
        }
        return parite;
    }

    /**
     * Retourne NUL si le nombre est zéro, PAIR si le nombre est pair et IMPAIR sinon
     *
     * @param nombre le nombre a tester
     * @return NUL, PAIR ou IMPAIR
     */
    public String verifierNombre(int nombre) {
        String parite;
        if (nombre == 0) {
            parite = "NUL";
        } else if (nombre % 2 == 0) {
            parite = "PAIR";
        } else {
            parite = "IMPAIR";
        }
        return parite;
    }

    public String nommerJour(int jour) {
        String jourSemaine;

        switch (jour) {
            case 1:
                jourSemaine = "Dimanche";
                break;
            case 2:
                jourSemaine = "Lundi";
                break;
            case 3:
                jourSemaine = "Mardi";
                break;
            case 4:
                jourSemaine = "Mercredi";
                break;
            case 5:
                jourSemaine = "Jeudi";
                break;
            case 6:
                jourSemaine = "Vendredi";
                break;
            case 7:
                jourSemaine = "Samedi";
                break;
            default:
                jourSemaine = "Invalide";
        }
        return jourSemaine;
    }

    public String nommerFinDeSemaine(int jour) {
        String jourSemaine;

        switch (jour) {
            case 1,7:
                jourSemaine = "FDS";
                break;
            case 2,3,4,5,6:
                jourSemaine = "Semaine";
                break;
            default:
                jourSemaine = "Invalide";
        }
        return jourSemaine;
    }
}
