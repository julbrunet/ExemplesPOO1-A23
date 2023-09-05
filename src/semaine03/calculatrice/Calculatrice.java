package semaine03.calculatrice;

public class Calculatrice {
    /**
     * Cette méthode AFFICHE la somme des 2 nombres reçus en entrée
     * @param nb1 Un nombre entier
     * @param nb2 Un autre nombre entier
     */
    public void additionner(int nb1, int nb2)
    {
        System.out.println("La somme est: " + (nb1 + nb2));
    }

    /**
     * Cette méthode RETOURNE la différence entre les 2 nombres reçus en entrée
     * @param pNb1 Un nombre entier
     * @param pNb2 Un autre nombre entier
     * @return La différence entre le premier et le deuxième nombre
     */
    public int soustraire(int pNb1, int pNb2)
    {
        int difference = pNb1-pNb2;
        return difference;		// ou seulement return pNb1 – pNb2;
    }

}
