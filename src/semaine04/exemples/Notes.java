package semaine04.exemples;

public class Notes {

    public static void main(String[] args) {


    }




    public char calculerNote(double pNote) {
        char grade = 'G';
        if (pNote < 0 || pNote > 100) {
            System.out.println("La note reçue n'est pas une valeur entre 0 et 100");
        } else {
            if (pNote >= 90 && pNote <= 100) {
                grade = 'A';
            } else {
                if (pNote >= 80 && pNote < 90) {
                    grade = 'B';
                } else {
                    if (pNote >= 70 && pNote < 80) {
                        grade = 'C';
                    } else {
                        if (pNote >= 60 && pNote < 70) {
                            grade = 'D';
                        } else {
                            if (pNote >= 50 && pNote < 60) {
                                grade = 'E';
                            } else {
                                if (pNote < 50 && pNote >= 0) {
                                    grade = 'F';
                                }
                            }
                        }
                    }
                }
            }
        }
        if (grade == 'A' || grade == 'B') {
            System.out.println("C'est une excellente note");
        }
        return grade;
    }
}
