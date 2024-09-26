package semaine12.exemples_corriges.modif_static;

/**
 * CoursPOO1 - semaine11.exemples_corriges.ordinateur
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class TestOrdinateur {
    public static void main(String[] args) {
        Ordinateur ordi1 = new Ordinateur();
        System.out.println();
        Ordinateur ordi2 = new Ordinateur(16,512);
        System.out.println();
        Ordinateur ordi3 = new Ordinateur(64,1024,"WINDOZE");
        System.out.println();

        System.out.println(ordi1);
        System.out.println(ordi2);
        System.out.println(ordi3);
        System.out.println("Memoire totale: "+ Ordinateur.getMemoireTotale());//devrait etre 256+512+1024=1792

        Ordinateur ordi4 = new Ordinateur(64,2048,"WINDOZE");
        System.out.println("Memoire totale: "+ Ordinateur.getMemoireTotale());//devrait etre 1792+2048 =3840
        System.out.println();
        ///ATTENTION!!!!!!! On doit aussi tenir a jour la memoire totale!!!!
        ordi2.setMemoire(1024);
        System.out.println("Memoire totale: "+ Ordinateur.getMemoireTotale());//devrait etre 3840-512+1024 =4352

    }
}
