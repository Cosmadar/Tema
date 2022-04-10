public class Continent {
    private static float suprafata;
    private static String nume;
    private static Coordonate coordonate;

    public Continent(float suprafata, String nume, Coordonate coordonate){
        this.nume= nume;
        this.suprafata=suprafata;
        this.coordonate=coordonate;
    }
    public Continent(){

    }

    public Continent(float suprafata, String nume, int coordonate) {
    }

    public static float getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(float suprafata) {
        this.suprafata = suprafata;
    }

    public static String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public static Coordonate getCoordonate() {
        return coordonate;
    }

    public void setCoordonate(Coordonate coordonate) {
        this.coordonate = coordonate;
    }


    @Override
    public String toString() {
        return "Continent{" +
                "suprafata=" + suprafata +
                ", nume=" + nume +
                ", coordonate= " + coordonate + '\'' +
                '}';
    }
}
