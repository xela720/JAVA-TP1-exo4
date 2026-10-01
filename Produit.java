package tp1.exo4.gstionMagasin;

/**
 *
 * @author piana
 */
public class Produit {
    private int id;
    private String nom;
    private int prix;
    private int quantité;

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public Produit(int id, String nom, int prix, int quantité) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantité = quantité;
    }
    
    public void afficherDetails(){
        System.out.println("id: " + id + ", nom: " + nom + ", prix: " + prix + ", quantite: " + quantité);
    }
}
