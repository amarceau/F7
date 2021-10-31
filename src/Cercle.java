public class Cercle {
    double rayon;

    public Cercle() {
        rayon = 0;
    }

    public Cercle(double pRayon) {
        rayon = pRayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double pRayon) {
        rayon = pRayon;
    }

    public static boolean estRayonValide(double rayon) {
        if (rayon < 0)
            return false;
        else
            return true;
    }

    public double getDiametre(double rayon) {
        return (2 * rayon);
    }

    public double getAire(double rayon) {
        return (Math.PI * rayon * rayon);
    }

    public double getCirconference(double rayon) {
        return (2 * Math.PI * rayon);
    }

    public void afficherInfosCercle() {
        System.out.println("Cercle de rayon : " + rayon);
        System.out.println("Sa circonférence est de : " + getCirconference(rayon));
        System.out.println("Son aire est de : " + getAire(rayon));
        System.out.println("Son diamètre est de : " + getDiametre(rayon));
    }
}
