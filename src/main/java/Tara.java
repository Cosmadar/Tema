public class Tara extends Continent{
    private String nume_tara;
    private String capitala;
    private int suprafata_tara;
    private int populatie_tara;

    public Tara(){

    }

    @Override
    public void setSuprafata(float suprafata) {
        super.setSuprafata(suprafata);
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    public Tara(String nume_tara, String capitala, int suprafata_tara, int populatie_tara){
        this.capitala=capitala;
        this.nume_tara=nume_tara;
        this.populatie_tara=populatie_tara;
        this.suprafata_tara=suprafata_tara;
        this.setNume(Continent.getNume());
        this.setSuprafata(Continent.getSuprafata());
    }

    @Override
    public String toString() {
        return "Tara{" +
                "nume_tara='" + nume_tara + '\'' +
                ", capitala='" + capitala + '\'' +
                ", suprafata_tara=" + suprafata_tara +
                ", populatie_tara=" + populatie_tara +
                '}';
    }

    public String getNume_tara() {
        return nume_tara;
    }

    public void setNume_tara(String nume_tara) {
        this.nume_tara = nume_tara;
    }

    public String getCapitala() {
        return capitala;
    }

    public void setCapitala(String capitala) {
        this.capitala = capitala;
    }

    public int getSuprafata_tara() {
        return suprafata_tara;
    }

    public void setSuprafata_tara(int suprafata_tara) {
        this.suprafata_tara = suprafata_tara;
    }

    public int getPopulatie_tara() {
        return populatie_tara;
    }

    public void setPopulatie_tara(int populatie_tara) {
        this.populatie_tara = populatie_tara;
    }
}
