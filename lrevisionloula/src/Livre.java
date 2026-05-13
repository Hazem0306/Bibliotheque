public class Livre extends Document{
    private int numeroEdition;
    private String datePublication;


    public Livre(String code, String titre, int nombreCopiesDisponibles,
                 int numeroEdition, String datePublication) {
        super(code, titre, nombreCopiesDisponibles);
        this.numeroEdition = numeroEdition;
        this.datePublication = datePublication;
    }


    public int getNumeroEdition() {
        return numeroEdition;
    }

    public String getDatePublication() {
        return datePublication;
    }
    @Override
    public String toString(){
        super.toString();
        System.out.println(numeroEdition+datePublication);
    }
}
