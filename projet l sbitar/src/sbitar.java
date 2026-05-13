public class sbitar {

    private patient[][] chambres;

    public sbitar(int etage,int nbchmbres) {
        chambres = new patient[etage][nbchmbres];
    }

    public void Afficherchambres(){


        for (int i =0 ;i< chambres.length;i++) {
            System.out.print("Etage"+(i+1));

            for (int j =0;j<chambres[i].length;j++){
                if (chambres[i][j] == null)
                    System.out.print("[libre]");
                else
                    System.out.print("[Occupe]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Ajouterpatient(int etage,int chambre,patient p) {
        if (etage<1 || etage > chambres.length ||chambre<1){
            System.out.println("chambre inexistante");
            return;
        }
        if (chambres[etage-1][chambre-1] != null){
            System.out.println("chambre occupe");
        }
        else {
            chambres[etage-1][chambre-1] = p;
            System.out.println("Patient ajoute aves succés");
        }
    }

    public void Consultpatient(int etage,int chambre){
        if (etage < 1 || etage  > chambres.length || chambre < 1 ) {
            System.out.println(" chambre inexistante !");
            return;
        }

        patient p = chambres[etage -1][chambre-1];
        if (p==null)
            System.out.println("chambre libre");
        else
            System.out.println("info du patient" + p);
    }

}
