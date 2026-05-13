public class AudioGuide extends OeuvreInteractive {

    private String langue;

    public AudioGuide(String id, String titre, String artiste, int annee, String langue) {
        super(id, titre, artiste, annee);
        this.langue = langue;
    }

    @Override
    public void AfficherDerails() {
        super.AfficherDerails();
        System.out.println("Langue: " + langue);
    }
}