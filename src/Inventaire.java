public class Inventaire {

    public Fruit[] getStockFruitFaible(Fruit[] tabFruit, int qStockFaible) {
        Fruit[] tabFout;
        int compteur;
        int compteurTabOut;

        compteur = 0;
        compteurTabOut = 0;

        for (int i = 0; i < tabFruit.length; i++) {
            if (tabFruit[i].getQuantiteEnInventaire() < qStockFaible)
                compteur++;
        }

        tabFout = new Fruit[compteur];

        for (int i = 0; i < tabFruit.length; i++) {
            if (tabFruit[i].getQuantiteEnInventaire() < qStockFaible) {
                tabFout[compteurTabOut] = tabFruit[i];
                compteurTabOut++;
            }

        }

        return tabFout;
    }
}

