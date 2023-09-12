package semaine04.exemples;

public class NotesCorrige {


    public char calculerNote(double pNote) {
        char grade = 'G';

        if (pNote < 0 || pNote > 100) {
            System.out.println("La note reçue n'est pas une valeur entre 0 et 100");
        } else {

            if (pNote >= 90) {
                //Ici on est certain que la note est entre 0 et 100
                //inclusivement puisqu’on est dans le else du premier if
                // Donc plus besoin de la condition pNote <= 100
                grade = 'A';
            }
            else if (pNote >= 80) {
                //Si on se rend dans ce else, on sait que la note est < 90
                //Donc plus besoin de la condition pNote < 90
                grade = 'B';
            }
            else if (pNote >= 70) {
                //Et ainsi de suite..
                grade = 'C';
            } else if (pNote >= 60) {
                grade = 'D';
            } else if (pNote >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
        }
        if (grade == 'A' || grade == 'B') {
            System.out.println("C'est une excellente note");
        }
        return grade;
    }

}
