package plustard;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-09-15
 */
public class Test {

    public static void main(String[] args) {

        for(int i = 0 ; i <6 ; i++ ){
            for (int j = 0 ; j <= 4 ; j++ ) {
                if(i == j) {
                    System.out.print("-");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }




        double x = 9.975;
        double y = 100.0;
        double a = x/y;
        System.out.println("a = " + a);
        double b = x*0.01;
        System.out.println("b = " + b);

        int diametre = 11;
        double rayon = (double) diametre /2;
        System.out.println("rayon = " + rayon);

        char monChar = '&';
        System.out.println("monChar = " + monChar);
        System.out.println("monChar en int = " + (int) monChar);


//        String nombre = "12";
//        int valeur = (int) nombre;
//


    }
}
