 class manager extends employe{
private float prime;

public manager(String nom,float salaire,float prime){

    super(nom,salaire);
    this.prime = prime;
}
@Override
     public float calculersalaire(){
    return super.calculersalaire() + this.prime;
}





}
