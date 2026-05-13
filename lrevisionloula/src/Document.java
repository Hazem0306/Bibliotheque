public class Document {

private String code;
private String titre;
private int nombrecopies;

public Document (String code ,String titre,Integer nombrecopies){
    this.code=code;
    this.nombrecopies=nombrecopies;
    this.titre=titre;
}

public String getCode(){
    return code;
}
public String getTitre(){
    return titre;
}
public int getNombrecopies(){
    return nombrecopies
}


}
