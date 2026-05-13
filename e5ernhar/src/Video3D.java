import java.security.PublicKey;

public class Video3D extends OeuvreInteractive{

    private int Duree,

    public Video3D(String ID,String Titre,String Artist,int annee,int duree){
        super(ID,Titre,Artist,annee);
        this.Duree=duree;
    }

    public int getDuree(){
        return Duree
    }
    @Override
    public void AfficherDerails(){
        super.AfficherDerails();
        System.out.println("Duree"+Duree);
    }
}

