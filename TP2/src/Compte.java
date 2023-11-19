public class Compte {
    String rib;
    double solde;
    char categorie;
    boolean ouvert;

    public Compte() {
    }

    public Compte(String rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "rib='" + rib + '\'' +
                ", solde=" + solde +
                ", categorie=" + categorie +
                ", ouvert=" + ouvert +
                '}';
    }

}
