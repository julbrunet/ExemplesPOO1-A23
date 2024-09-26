package semaine11.exemples_corriges.animaux;

/**
 * CoursPOO1 - semaine11
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public record TestAnimal() {
    public static void main(String[] args) {
        TestAnimal test = new TestAnimal();

        test.testAnimal();
    }
    public void testAnimal() {
        Animal elephant = new Animal("Elephant",2000,1,0);
        Animal souris = new Animal("Souris",.2,5,0);


        elephant.decrire();
        souris.decrire();

        System.out.println();

        souris.avancer(2);
        elephant.avancer(2);

        elephant.decrire();
        souris.decrire();

        souris.avancer(5);
        elephant.avancer(5);

        elephant.decrire();
        souris.decrire();
        System.out.println();
    }

}
