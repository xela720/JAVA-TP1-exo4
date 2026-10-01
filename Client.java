package tp1.exo4.gstionMagasin;

/**
 *
 * @author piana
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    private static int comp;

    public Client(String nom, String email) {
        this.id = ++comp;
        this.nom = nom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void afficherDetails(){
        System.out.println("id: " + id + "\nnom: " + nom + "\nemail: " + email);
    }
}
