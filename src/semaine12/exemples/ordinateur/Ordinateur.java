package semaine12.exemples.ordinateur;

/**
 * CoursPOO1 - semaine11.exemples_corriges.ordinateur
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class Ordinateur {
    public static final int MEMOIRE_DEFAUT = 256;
    public static final int RAM_DEFAUT = 8;
    public static final String AUCUN = "Aucun";

    private int ram;
    private int memoire;
    private String systeme;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoire() {
        return memoire;
    }

    public void setMemoire(int memoire) {
        this.memoire = memoire;
    }

    public String getSysteme() {
        return systeme;
    }

    public void setSysteme(String systeme) {
        this.systeme = systeme;
    }

    @Override
    public String toString() {
        return "Ordinateur{" +
                "ram=" + ram +
                ", memoire=" + memoire +
                ", systeme='" + systeme + '\'' +
                '}';
    }
}


