package autheur;

public class autheur {
    //fields

    protected final String initials;
    protected final String lastname;
    //constructor

    public autheur(String initials, String lastname) {
        this.initials = initials;
        this.lastname = lastname;
    }


    //get/set
public String getInitials() {
        return initials;
}
public String getLastname() {
        return lastname;
}


}
