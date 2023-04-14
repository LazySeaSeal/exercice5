package exercice5;

public class etudiant3eme extends Etudiant {
    private String branche;


    etudiant3eme(String branche,int id,String nom,float moyenne)
    {
        super(id,nom,moyenne);
        this.branche=branche;
    };
    public void ajouter_abs()
    {
        super.setMoyenne(super.getMoyenne()-0.5);
    };
}
