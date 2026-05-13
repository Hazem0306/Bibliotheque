public class Rapport extends Document {

    private String presidentJury;
    private String rapporteur;


    public Rapport(String code, String titre, int nombreCopiesDisponibles,
                   String presidentJury, String rapporteur) {
        super(code, titre, nombreCopiesDisponibles);
        this.presidentJury = presidentJury;
        this.rapporteur = rapporteur;
    }


    public String getPresidentJury() {
        return presidentJury;
    }

    public String getRapporteur() {
        return rapporteur;
    }

}
