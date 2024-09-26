package semaine04.exemples;

/**
 * ExemplesPOO1
 *
 * @author Julien.Brunet
 * @since 2023-09-11
 */
public class TestOperateurBooleans {
    public static void main(String[] args) {
        TestOperateurBooleans test = new TestOperateurBooleans();
        test.testeOperateurs();

        int a= 25;
        int b = 20;

        int max = a<b ? b : a;
        System.out.println("max = " + max);


    }

    public void testeOperateurs() {

        System.out.println(testAnd(2,6));
        System.out.println(testAnd(5,10));
        System.out.println(testAnd(2,11));
        System.out.println(testAnd(6,11));


        System.out.println(testOr(2,6));
        System.out.println(testOr(5,10));
        System.out.println(testOr(2,11));
        System.out.println(testOr(6,11));

    }

    public boolean testAnd(int a , int b){
        return a < 5 && b<=10;
    }

    public boolean testOr(int a , int b){
        return a < 5 || b<=10;
    }






}
