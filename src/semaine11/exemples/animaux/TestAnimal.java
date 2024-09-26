package semaine11.exemples.animaux;


/**
 * CoursPOO1 - semaine11
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public class TestAnimal {
    public static void main(String[] args) {
        TestAnimal test = new TestAnimal();

        test.testAnimal();


    }

    public void testAnimal1() {

        Animal1 elephant = new Animal1();
        elephant.espece = "Elephant";
        elephant.poids = 2000;

        Animal1 souris = new Animal1();
        souris.espece = "Souris des champs";
        souris.poids = 0.1;


        elephant.decrire();
        souris.decrire();


    }


    public void testAnimal2() {

        Animal2 elephant = new Animal2("Elephant", 2000);
        Animal2 souris = new Animal2("Souris des champs", .1);

        elephant.decrire();
        souris.decrire();

    }


    public void testAnimal() {

        Animal elephant = new Animal("Elephant", 2000);
        Animal souris = new Animal("Souris des champs", .1);

        elephant.setVitesse(2);
        souris.setVitesse(5);

        System.out.println(elephant);
        System.out.println(souris);

        elephant.avancer(1);
        souris.avancer(1);


        System.out.println(elephant);
        System.out.println(souris);



    }
}
