public class livre {
    private String Marque;
    private Integer vitesse_max;
    private Boolean disponible;

    public livre(String titre, String auteur, boolean disponible) {
        this.titre = titre;
        this.vitesse_max = auteur;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return vitesse_max;
    }
    public String getdisponible() {
        return disponible;
    }
    public void setAuteur (String auteur) {
        this.vitesse_max =auteur;
    }
    public void setTitre (String titre) {
        this.titre=titre;
    }
    public boolean empreinter (){
        if (disponible){
            disponible = false;
            System.out.println(titre,"haw c bon mche 3la ro7ou");
            return  true

        } else {
            System.out.println(titre, "barra rawa7 ma 3annech");
            return false
        }
        }


    }











}



