package semaine03.exercices;

//Julien
//Brunet
//123123123
public class Pythagore {
    public static void main(String[] args) {
        new Pythagore();
    }
    public Pythagore(){
//        afficherSomme(5,7);
//        afficherSomme(50,13);
//        afficherSomme(1000,-987);

//        int somme = calculerSomme(5,7);
//        System.out.println("5+7" + somme);
//
//        int a = 100;
//        int b = 23;
//        int autre = calculerSomme(a,b);
////        System.out.println(a + " + " + b + " = " +autre);
//
//        int monCarre = calculerCarre(12);
//        System.out.println(monCarre);

        int x = calculerCarre(5);
        int y = calculerCarre(3);
        int monRes = calculerSomme(x,y);
        System.out.println("le res complet est "+ monRes);

    }

    public void afficherSomme(int premierNombre,int deuxiemeNombre){
        int resultat = premierNombre + deuxiemeNombre;
        System.out.println(premierNombre + " + " + deuxiemeNombre + " = "+ resultat);
    }

    public int calculerSomme(int premierNombre,int deuxiemeNombre){
        int resultat = premierNombre + deuxiemeNombre;
        return resultat;
    }

    public int calculerCarre(int nombre){
        int res = nombre*nombre;
        return res;
    }
}
