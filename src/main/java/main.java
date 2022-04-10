public class main {
    public static void main(String[] args) {
        Coordonate coordonate_1=new Coordonate(45,58);
        Continent continent_1=new Continent(245.12f,"Asia",coordonate_1);
        Tara tara_1=new Tara("Japonia","Tokyo",377975, 125000000);
        Continent continent_2=new Continent();
        Tara tara_2=new Tara();
        System.out.println(tara_1);
        System.out.println(tara_2);
        System.out.println(continent_1);
        System.out.println(continent_2);
    }
}
