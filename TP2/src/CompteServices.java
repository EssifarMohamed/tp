public class CompteServices {
    public Compte ouvrir(String rib , double solde){
        if(solde < 0){
            return null;
        }else {
            Compte c1 = new Compte(rib,solde);
            c1.ouvert=true;
            if(solde <= 100){
                c1.categorie='D';
            } else if (solde <= 1000) {
                c1.categorie ='C';
            }else {
                c1.categorie='Z';
            }
            return c1;
        }
    }

    public int debiter(Compte c , double montant){
        if(c.ouvert == false) {
            return -1;
        }else {
            c.solde += montant;
            return 1;
        }
    }

    public int crediter(Compte c, double montant){
        if(c.ouvert == false) {
            return -1;
        } else if (c.solde < montant) {
            return -2;
        } else {
            c.solde -= montant;
            return 1;
        }
    }
}
