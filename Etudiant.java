package exercice5;

public class Etudiant {
    private int id;
    private String nom;
    private double moyenne;
    Etudiant(int id,String nom,double moyenne)
    {
        this.id=id;
        this.nom=nom;
        this.moyenne=moyenne;
    };
    public boolean equals(Etudiant a)
    {
        if ((this.id==a.id) && (this.nom==a.nom))
            return(true);
        return(false);
    };
    public String toString()
    {
        return(this.id+":"+this.nom+":"+String.valueOf(this.moyenne));
    };
    public void ajouter_abs()
    {

    };
    public double getMoyenne()
    {
        return(this.moyenne);
    }
    public int getId()
    {
        return(this.id);
    };
    public void setMoyenne(double moyenne)
    {
        this.moyenne=moyenne;
    }
}
