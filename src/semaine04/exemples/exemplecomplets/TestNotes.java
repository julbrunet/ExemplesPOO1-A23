package semaine04.exemples.exemplecomplets;




/**
 * ExemplesPOO1.iml
 *
 * @author julien.brunet
 * @since 2024-09-19
 */
public class TestNotes {

    public static void main(String[] args) {
        TestNotes notes = new TestNotes();
        notes.testSuffitPassage();
    }

    public void testSuffitPassage() {
        Notes test = new Notes();
        System.out.println(!test.suffitPassage(-1));
        System.out.println(!test.suffitPassage(0));
        System.out.println(!test.suffitPassage(10));
        System.out.println(!test.suffitPassage(59));
        System.out.println(test.suffitPassage(60));
        System.out.println(test.suffitPassage(80));
        System.out.println(test.suffitPassage(99));
        System.out.println(test.suffitPassage(100));
        System.out.println(!test.suffitPassage(110));
    }

}
