package tp1.exo4.gstionMagasin;

import java.util.ArrayList;

/**
 *
 * @author piana
 */
public class Panier {
    private final ArrayList<Produit> panier;
    
    public Panier() {
        panier = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit){
        panier.add(produit);
    }
    
    public void supprimerProduit(Produit produit){
        panier.remove(produit);
    }
    
    public void supprimerToutProduits(){
        panier.clear();
    }
    
    public void afficherPanier(){
        for (Produit produit : panier) {
            produit.afficherDetails();
        }
    }
    
    public Produit trouverProduitParNom(String nom){
        for(Produit produit : panier){
            if (produit.getNom().equalsIgnoreCase(nom)){
                return produit;
            }
        }
        System.out.println("produit invalide");
        return null;
    }
    
    public void retirerQuantité(){
        int newQ;
        for (Produit produit : panier) {
            newQ = produit.getQuantité() - 1;
            produit.setQuantité(newQ);
        }
    }
    
    public String getNomsProduits(){
        String res = "";
        for (Produit produit : panier) {
            res += produit.getNom() + ", ";
        }
        return res;
    }
    
    public int calculerTotal(){
        int total = 0;
        for (Produit produit : panier) {
            total += produit.getPrix();
        }
        return total;
    }
}
