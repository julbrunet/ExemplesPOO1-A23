package semaine05;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-09-15
 */
public class TestInteger {
    public static void main(String[] args) {
        //int intValeur;
        System.out.println("Integer.parseInt est une méthode qui convertit une chaine en variable int:");
        String strValeur = "2019";
        int intValeur = Integer.parseInt( strValeur );
        System.out.println("La chaine est " + strValeur);
        System.out.println("L'entier est " + intValeur );
//
//
//        System.out.println("Si on ajoute un à l'entier : " + (intValeur + 1));
//        System.out.println("Si on ajoute un à la string : " + (strValeur + 1));



        double value = Double.parseDouble("3.24");
        System.out.println(value+2);


//
//        String autreValeur = "douze";
//        //Leve une exception...(erreur d'execution)
//
//        intValeur = Integer.parseInt(  autreValeur);
//
//        System.out.println("L'entier est " + intValeur );
//
//        double a = Double.parseDouble("2,3");
//        System.out.println("La chaine est " + a);
    }
}
