package exercice5;

public class etudiantAlternance {
    private int salaire;

    etudiantAlternance(int salaire,int id,String nom,double moyenne)
    {
        super(id,nom,moyenne);
        this.salaire=salaire;
    }
    public void ajouter_abs()
    {
        this.salaire=this.salaire-50;
    };
    public String to_String()
    {
        return(super.toString()+":"+String.valueOf(salaire));
    }
}
