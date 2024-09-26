package semaine13.exemples.test_enum;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-30
 */
public class TEstEnum {
    public enum Day {
        SUNDAY , MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }




    public static void main(String[] args) {
        Day jour = Day.MONDAY;
        System.out.println(jour);

        Day jour1 = Day.FRIDAY;

        if(jour.ordinal() < jour1.ordinal() ){
            System.out.println("Ok");
        }
    }
}
