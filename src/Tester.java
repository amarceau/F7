public class Tester {
    public Tester() {
        Inventaire inv;
        Fruit f;
        Fruit[] tabFin;
        Fruit[] tabFout;

        tabFin = new Fruit[4];

        f = new Fruit();
        f.setNom("Pat Boon");
        f.setQuantiteEnInventaire(4);

        tabFin[0] = f;

        f = new Fruit();
        f.setNom("Itor Lamop");
        f.setQuantiteEnInventaire(2);

        tabFin[1] = f;

        f = new Fruit();
        f.setNom("Joe Blo");
        f.setQuantiteEnInventaire(5);

        tabFin[2] = f;

        f = new Fruit();
        f.setNom("Bob Binette");
        f.setQuantiteEnInventaire(3);

        tabFin[3] = f;

        inv = new Inventaire();
        tabFout = inv.getStockFruitFaible(tabFin, 4);

        for (int i = 0; i < tabFout.length; i++) {
            System.out.println(tabFout[i].getNom() + "-" + tabFout[i].getQuantiteEnInventaire());
        }
    }

    public static void main(String[] args) {
        new Tester();
    }
}
