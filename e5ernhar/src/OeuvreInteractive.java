import java.net.IDN;

public class OeuvreInteractive extends Interactive{
    private String ID;
    private String Titre;
    private String Artist;
    private int annee;
    private int vues;
    private boolean disponible;


    public OeuvreInteractive(String ID,String Titre,String Artist,int annee){
        this.ID=ID;
        this.Titre=Titre;
        this.Artist=Artist;
        this.annee=annee;
        this.vues=0;
        this.disponible=true;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public void incrementerVues() {
        this.vues++;
    }

    public String getId() {
        return ID;
    }

    public boolean isDisponible() {
        return disponible;
    }
    @Override
    public void AfficherDerails(){
        System.out.println("titre"  + Titre);
    }
}
