package tp1.exo4.gstionMagasin;

import java.util.Scanner;

/**
 *
 * @author piana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produit bonbon = new Produit(1, "BONBON", 5, 100);
        Produit soda = new Produit(2, "SODA", 3, 200);
        Produit sandwich = new Produit(3, "SANDWICH", 10, 30);
        Produit dessert = new Produit(4, "DESERT", 8, 50);
        Produit chips = new Produit(5, "CHIPS", 5, 50);
        Produit salade = new Produit(6, "SALADE", 10, 30);
        
        Produit chaussure = new Produit(1, "CHAUSSURE", 80, 50);
        Produit pantaCourt = new Produit(2, "SHORT", 20, 50);
        Produit tshirt = new Produit(3, "T-SHIRT", 10, 100);
        Produit veste = new Produit(4, "VESTE", 40, 50);
        Produit pantalon = new Produit(5, "PANTALON", 50, 50);
        Produit chaussette = new Produit(6, "CHAUSSETTE", 10, 100);
                
        Magasin magasin1 = new Magasin("Carrefour");
        magasin1.ajouterProduit(bonbon);
        magasin1.ajouterProduit(soda);
        magasin1.ajouterProduit(sandwich);
        magasin1.ajouterProduit(dessert);
        magasin1.ajouterProduit(chips);
        magasin1.ajouterProduit(salade);
        
        Magasin magasin2 = new Magasin("uniqlo");
        magasin2.ajouterProduit(chaussure);
        magasin2.ajouterProduit(pantaCourt);
        magasin2.ajouterProduit(tshirt);
        magasin2.ajouterProduit(veste);
        magasin2.ajouterProduit(pantalon);
        magasin2.ajouterProduit(chaussette);
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nVeuillez vous enregistrer");
            System.out.println("nom: ");
            String nom = sc.nextLine();
            System.out.println("email: ");
            String email = sc.nextLine();
            Client client = new Client(nom, email);


            System.out.println("Voulez-vous achetez a manger (1) ou des habits (2) ?");
            int choixMag = sc.nextInt();
            Magasin catalog;

            switch (choixMag) {
                case 1 -> catalog = magasin1;
                case 2 -> catalog = magasin2;
                default -> {
                    System.out.println("choix du magasin invalide !");
                    return;
                }
            }

            Panier panier = new Panier();
            int i = 0;
            while(i==0){
                System.out.println("\n--- Menu Magasin " + catalog.getNom() + " --- ");
                System.out.println("1. Afficher les produits disponibles");
                System.out.println("2. Ajouter un produit au panier");
                System.out.println("3. supprimer un produit au panier");
                System.out.println("4. Afficher le panier");
                System.out.println("5. Passer la commande");
                System.out.println("6. Quitter");

                int operation = sc.nextInt();
                sc.nextLine();

                switch(operation){
                    case 1 -> catalog.afficherProduitDisonibles();
                    case 2 -> {
                        System.out.println("quel produit vous interresse ?");
                        String nomprod = sc.nextLine();
                        panier.ajouterProduit(catalog.trouverProduitParNom(nomprod));
                    }
                    case 3 -> {
                        System.out.println("quel produit voulez-vous retirer du panier ?");
                        String nomprod = sc.nextLine();
                        panier.supprimerProduit(panier.trouverProduitParNom(nomprod));
                    }
                    case 4 -> panier.afficherPanier();
                    case 5 -> {
                        Commande commande = new Commande(client.getNom(), panier.getNomsProduits(), panier.calculerTotal());
                        commande.afficherDetailsCommande();
                        System.out.println("valider (Y/...)?");
                        String validation = sc.nextLine();
                        if (validation.equals("Y")){
                            panier.retirerQuantité();
                            panier.supprimerToutProduits();
                        } 
                    }
                    case 6 -> i=1;

                }}}
    }
    
}
