package tp1.exo4.gstionMagasin;

/**
 *
 * @author piana
 */
public class Commande {
    private int idCommande;
    private String client;
    private String produitsCommandes;
    private int total;
    
    private static int comp;

    public Commande(String client, String produitsCommandes, int total) {
        this.idCommande = ++comp;
        this.client = client;
        this.produitsCommandes = produitsCommandes;
        this.total = total;
        
    }
    
    public void afficherDetailsCommande(){
        System.out.println("id de la commande: " + idCommande + "\nclient: " + client + "\nproduits commandes: " + produitsCommandes + "\ntotal : " + total + " euros");
    }
}
