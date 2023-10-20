package semaine04.exemples;

import java.sql.SQLOutput;

public class Notes {

    public static void main(String[] args) {
        Notes notes = new Notes();
        System.out.println("-10 est suffisante: " + notes.validerNote(-10));
        System.out.println("0 est suffisante: " + notes.validerNote(0));
        System.out.println("40 est suffisante: " + notes.validerNote(40));
        System.out.println("60 est suffisante: " + notes.validerNote(60));
        System.out.println("70 est suffisante: " + notes.validerNote(70));
        System.out.println("100 est suffisante: " + notes.validerNote(100));
        System.out.println("120 est suffisante: " + notes.validerNote(120));
    }


    public boolean validerNote(int note) {
        boolean passage = false;
        if (note < 0 || note > 100) {
            System.out.println("La note est invalide");
        }
        if (note >= 60 && (note <= 100)) {
            passage = true;
        }
        return passage;
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
