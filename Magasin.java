package tp1.exo4.gstionMagasin;

import java.util.ArrayList;

/**
 *
 * @author piana
 */
public class Magasin {
    private final ArrayList<Produit> catalog;
    private String nom;

    public String getNom() {
        return nom;
    }

    public Magasin(String nom) {
        this.nom= nom;
        catalog = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit){
        catalog.add(produit);
    }
    
    public void afficherProduitDisonibles(){
        for(Produit produit : catalog){
            produit.afficherDetails();
        }
    }
    
    public Produit trouverProduitParNom(String nom){
        for(Produit produit : catalog){
            if (produit.getNom().equalsIgnoreCase(nom)){
                return produit;
            }
        }
        System.out.println("produit invalide");
        return null;
    }
}
