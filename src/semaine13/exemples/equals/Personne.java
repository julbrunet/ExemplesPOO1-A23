package semaine13.exemples.equals;

import java.util.Objects;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-27
 */
public class Personne {

    private String nom;

    private String prenom;

    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public static void main(String[] args) {
        Personne[] personnes = {new Personne(null, null, 12),
                new Personne("Beatrice", "Seconde", 23),
                new Personne("Charles", "Thrid", 12),
                new Personne("Denis", "Quat", 88)};

        Personne personne = new Personne("Charles", "Thrid", 12);

        for (Personne personne1 : personnes) {
            if (personne1.equals(personne)) {
                System.out.println("Trouvé!!!!");
            } else {
                System.out.println("Pas trouvé");
            }
        }


//        Personne p1 = new Personne("Joe","Dalton",33);
//        Personne p2 = new Personne("Joe","Dalton",33);
//        Personne p3 = p1;
//
//        System.out.println(p1 == p2);
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals("une chaine bidon"));
//
//        System.out.println(p1 == p3);
//        System.out.println(p1.equals(p3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne personne)) return false;
        return  Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }
//    public boolean equals(Object obj) {
//        boolean egaux = false;
//        if (obj instanceof Personne) {
//            Personne other = (Personne) obj;
//            egaux = this.age == other.age && Objects.equals(this.nom, other.nom) && Objects.equals(this.prenom,other.prenom)   ;
//        }
//        return egaux;
//    }
}
