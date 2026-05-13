import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Bibliotheque {

    private Emprunter emprunteur;
    private Document document;


    public void Emprunt(Emprunter emprunteur, Document document) {
        this.emprunteur = emprunteur;
        this.document = document;

    }


    public Emprunter getEmprunteur() {
        return emprunteur;
    }

    public Document getDocument() {
        return document;
    }


    public class Bib {

        private List<Document> docs;

        public Bib() {
            docs = new ArrayList<>();
        }

        public void Ajouterdocs(Document d) {
            docs.add(d);
        }

        public void Booleanrechercher(Document d){
            for (Document d:docs){

            }
        }



    }
}
