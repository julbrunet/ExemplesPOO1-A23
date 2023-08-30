package plustard;


public class TestInstanceEtStatiques {

    private int attributTest = 10;

    public static void main(String[] args) {
        TestInstanceEtStatiques test = new TestInstanceEtStatiques();

        test.methodeInstance();
        TestInstanceEtStatiques.methodeStatique();
    }

    public static void methodeStatique() {
        System.out.println("coucou, je suis appelé sur la classe directement sans créer d'objet");
        //attributTest = 12;
    }

    public  void methodeInstance() {
        System.out.println("Bonjour, je suis appelé sur un objet de la classe");
        //attributTest = 12;
    }

}
