package saviez_vous;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-09-01
 */
public class Signature {

    //les trois premieres different par leur liste de param�tres
    //elles peuvent cohabiter, on dit que ce sont des surcharges de la premi�re
    public void faireQuelqueChose() {

    }
    public void faireQuelqueChose(int a, int b) {

    }
    public void faireQuelqueChose(double a, int b) {

    }
    //les deux suivantes ne peuvent pas cohabiter avec les pr�c�dentes
//    public void faireQuelqueChose(int autre,int autreAussi){} //a les meme parametres que la 2
//    public String faireQuelqueChose() {}  //a les meme parametres que la 1 meme si le type de retour est diff�rent

}
