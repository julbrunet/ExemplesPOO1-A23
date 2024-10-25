package semaine09.exemples;

import java.util.Arrays;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-10-19
 */
public class TestTableaux {
    public static void main(String[] args) {
        TestTableaux object = new TestTableaux();
        int a = 12;
        object.methode(a);
        System.out.println("a = " + a);
//Bilan entier pas modifie!!

        int[] tableau = {5,2,3,4};
        object.methode(tableau);
        System.out.println("tableau = " + Arrays.toString(tableau));
//Bilan tableau entier est modifie!!

//        String test = "avant";
//        object.methode(test);
//        System.out.println("tableau = " + test);
    }

    public void methode(int param) {
        param = param+10;
    }
    public void methode(int[] param) {
        param[0] = param[0]+10;
       // param = new int[10];
    }

    public void methode(String param) {
        param = "apres";
    }
    //Bilan entier pas modifie!!
}
