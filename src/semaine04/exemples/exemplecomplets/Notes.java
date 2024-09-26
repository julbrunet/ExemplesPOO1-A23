package semaine04.exemples.exemplecomplets;

public class Notes {

    /**
     * Determine si une note suffit au passage d'un cours.
     * Une note suffisante est une note supérieure ou égale à 60
     * Attention si la note est invalide (négative ou supérieure à 100)
     * la méthode va écrire un message à la console et retourner false!
     * @param note la note à évaluer
     * @return  true si c'est suffisant et false sinon.
     */
    public boolean suffitPassage(int note) {
        boolean passage = false;
        if(note<0  || note >100) {
            System.out.println("La note est invalide");
        }
        else if(note>=60) {
            passage = true;
        }
        return passage;
    }


}
