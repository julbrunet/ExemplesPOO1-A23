package semaine02;

/**
 * Semiane02
 *
 * @author Julien.Brunet
 * @since 2023-08-24
 */
public class Exemple2 {

    public static void main(String[] args) {
        Exemple2 exemple = new Exemple2();
        //exemple.testerOperateurArithmetiques();
       // exemple.testerOperteursAffectation();
        exemple.testerOperateursIncrementation();
      //  exemple.testerOperateursRelationnels();
     //   exemple.testerPriorite();
     //   exemple.testerDepassementByte();
    }

    public void testerOperateurArithmetiques() {
        
        int somme = 2 + 5;
        System.out.println(" En int : 2 + 5 = " + somme);
        double sommeDecimale = 2 + 5;
        System.out.println(" En double: 2.0 + 5.0 = " + sommeDecimale);

        int quotient = 19 / 5;
        System.out.println(" En int : 19/5 = " + quotient);
        double quotientDecimal = 19.0 / 5.0;
        System.out.println(" En double: 19.0/5.0 = " + quotientDecimal);

        int reste = 19 % 5;
        System.out.println("reste = " + reste);

        reste =-13%10;
        System.out.println("reste = " + reste);
    }

    public void testerOperteursAffectation() {
        int a =10;
        a+=3;
        System.out.println("a = " + a);

        a=10;
        a-=5;
        System.out.println("a = " + a);

        a=10;
        System.out.println(a-5);
        System.out.println("a = " + a);

    }

    public void testerOperateursIncrementation() {

//        int x = 5;
//        x++;
//        System.out.println(x);
//
//        x=5;
//        ++x;
//        System.out.println(x);

        int a =3;
        int b =++a;
        System.out.println("a: "+a);
        System.out.println("b: "+ b);

        a =3;
        b =a++;
        System.out.println("a: "+a);
        System.out.println("b: "+ b);




//        int  x=5;
//        System.out.println(x++);
//        System.out.println("Nouvelle valeur de x " + x);
//
//        x=5;
//        System.out.println(++x);
//        System.out.println("Nouvelle valeur de x " + x);



    }

    public void testerDepassementByte(){
        int a= 127;

        a++;
        System.out.println("a = " + a);

        byte b = 127;
        b++;
        System.out.println("b = " + b);


    }


    public void testerOperateursRelationnels() {

    }

    public void testerPriorite(){
        int a, b, c, d;
        a = 5;
        b = 10;
        c = 2;

        d = a + b * c;
        // Le compilateur fera (b * c) + a = 25
        System.out.println("d = " + d);

        d = c * b / 2;
        // le compilateur fera c * b / 2 = 10
        System.out.println("d = " + d);

        d = (a + b) * c;
        // Le compilateur fera (a + b) * c = 30
        System.out.println("d = " + d);

        d = c * (b / 2);
        // Le compilateur fera (b / 3) * c = 10
        System.out.println("d = " + d);


    }

}
