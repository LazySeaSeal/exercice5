package exercice5;

public class ecole {
    private String nom;
    private static int nb=0;
    private Etudiant t[];
    ecole(String nom)
    {
            this.nom=nom;
            t=new Etudiant[500];

    };
    public boolean ajouter_etudiant(Etudiant e)
    {
        nb++;
        if(nb>500)
        {
            if(rechercher_etudiant(e)!=-1) {
                t[nb] = e;
                return (true);
            }
            else
            {
                System.out.println("etudiant existant");
            }
        }
        else
        {
            System.out.println("We can't add more students");
            return (false);
        }

    };
    public int rechercher_etudiant(Etudiant e)
    {
        int tmp=-1;
        int i;
        for( i=0;i<t.length;i++)
        {
            if (t[i].equals(e))
            {
                tmp=i;
                break;
            }
        }
        if (tmp>0)
            return(t[i].getId());
            return(tmp);

    }

    public double getMoyenneDes3A(){
        int i;
        int nbDes3A=0;
        double moy=0;
        for(i=0;i<t.length;i++)
        {
            if(t[i] instanceof etudiant3eme)
            {
                nbDes3A=nbDes3A+1;
                moy=moy+t[i].getMoyenne();
            }
        }
        return(moy/nbDes3A);
    }
    public double getMoyenneAlternant(){
        int i;
        int nbA=0;
        double moy=0;
        for(i=0;i<t.length;i++)
        {
            if(t[i] instanceof etudiantAlternance)
            {
                nbA=nbA+1;
                moy=moy+t[i].getMoyenne();
            }
        }
        return(moy/nbA);
    }
    public String toString()
    {
        int i;
        String s="ecole"+this.nom+"liste etudiants:";
        for(i=0;i<t.length;i++)
            s=s+t[i].toString()+":";
        return(s);
    }
    public void changer_ecole(Etudiant e,ecole ec)
    {
        int k=rechercher_etudiant(e);
        if (k!=t.length)
        {
            nb--;
        }
        else
        {
            for(;k<t.length-1;k++)
                t[k]=t[k+1];
            nb--;
        }

    }

}
