public class Emprunter {

private String identifiant;
private String nom;
private String prenom;

public Emprunter (String identifiant,String nom,String prenom){
    this.identifiant= identifiant;
    this.nom=nom;
    this.prenom=prenom;
}
public String getIdentifiant(){
    return identifiant;
}
public String getNom(){
    return nom;
}
public String getPrenom(){
    return prenom;
}
@Override
    public String toString(){
    System.out.print("identifiant" + identifiant);
}


}
