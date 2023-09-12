package semaine04.exemples;

public class NotesCorrige {

    public static void main(String[] args) {
        NotesCorrige notes = new NotesCorrige();
        notes.testSuffitPassage();

        notes.testCalculerNote();
    }



    public void testSuffitPassage() {
        System.out.println(!suffitPassage(-1));
        System.out.println(!suffitPassage(0));
        System.out.println(!suffitPassage(10));
        System.out.println(!suffitPassage(59));
        System.out.println(suffitPassage(60));
        System.out.println(suffitPassage(80));
        System.out.println(suffitPassage(99));
        System.out.println(suffitPassage(100));
        System.out.println(!suffitPassage(110));
    }

    public boolean suffitPassage(int note) {
        boolean passage = false;
        if(note<0 ) {
            System.out.println("La note est invalide");
        }
        if (note >100) {
            System.out.println("La note est invalide");
        } // ca va nus prendre qqch por grouper les deux instructions ci-dessus!!le ou!!

        if(note>=60) {
            if(note <=100) {
                passage = true;
            }
        }// ca va nus prendre qqch por grouper les deux instructions ci-dessus!!le et!!
        return passage;
    }

 /*   public boolean suffitPassage(int note) {
        boolean passage = false;
        if (note < 0 || note >100 ){
            System.out.println("La note est invalide");
        }

        if (note >= 60 && note <= 100) {
            passage = true;
        }// ca va nus prendre qqch por grouper les deux instructions ci-dessus!!le et!!
        return passage;
    }
*/


    private void testCalculerNote() {
        System.out.println(calculerNote(-1)=='G');
        System.out.println(calculerNote(0)=='F');
        System.out.println(calculerNote(10)=='F');
        System.out.println(calculerNote(50)=='E');
        System.out.println(calculerNote(59)=='E');
        System.out.println(calculerNote(60)=='D');
        System.out.println(calculerNote(69)=='D');
        System.out.println(calculerNote(70)=='C');
        System.out.println(calculerNote(79)=='C');
        System.out.println(calculerNote(80)=='B');
        System.out.println(calculerNote(89)=='B');
        System.out.println(calculerNote(90)=='A');
        System.out.println(calculerNote(100)=='A');
        System.out.println(calculerNote(101)=='G');

    }


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
            } else if (pNote >= 80) {
                //Si on se rend dans ce else, on sait que la note est < 90
                //Donc plus besoin de la condition pNote < 90
                grade = 'B';
            } else if (pNote >= 70) {
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
