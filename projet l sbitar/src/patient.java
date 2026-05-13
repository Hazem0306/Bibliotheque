public class patient {
    private String nom;
    private int age;
    private String maladie;

    public patient(String nom,int age,String maladie){
        this.nom = nom;
        this.age = age;
        this.maladie = maladie;

    }
    public String getNom(){
        return nom;
    }
    @Override
    public String toString() {
        return "Nom: " + nom + ", Âge: " + age + ", Maladie: " + maladie;
    }


}


