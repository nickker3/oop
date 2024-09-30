package publications;
import autheur.autheur;


public class Source {


//    Een boek heeft oa. een titel, auteur, jaartal en editie.
//    Een artikel heeft oa. een titel, auteur en jaartal.


    //fields

    protected final String titel;
    protected final String autheur;
    protected final int jaartal;


    //constructor

    public Source(String titel, String autheur, int jaartal) {
        this.titel = titel;
        this.autheur = autheur;
        this.jaartal = jaartal;
    }

public String getTitel() {
        return titel;
}
public String getAutheur() {
        return "iets";
}
public int getJaartal() {
        return jaartal;
}





}
