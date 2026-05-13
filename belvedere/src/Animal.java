public abstract class Animal implements AnimalActions {
    private String nom;
    private int age;
    private TypeAnimal type;


    public Animal(String nom, int age, TypeAnimal type) {
        this.nom = nom;
        this.age = age;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Type : " + type);
    }
}
