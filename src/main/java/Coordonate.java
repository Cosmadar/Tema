public class Coordonate {
    private int latitudine;
    private int longitudine;

    public Coordonate(){

    }
    public Coordonate(int latitudine,int longitudine){
        this.latitudine=latitudine;
        this.longitudine=longitudine;
    }

    public double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(int latitudine) {
        this.latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(int longitudine) {
        this.longitudine = longitudine;
    }

    @Override
    public String toString() {
        return "{" +
                "latitudine=" + latitudine +
                ", longitudine=" + longitudine +
                '}';
    }
}
