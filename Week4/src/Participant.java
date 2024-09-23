public class Participant {
//1. Maak een klasse Participant aan met de volgende velden: firstname, lastname, email, participationCount. Het veld participationCount is een integer.
//            2. Maak een constructor die de velden firstname, lastname, email initialiseert door middel van parameters.
//    participationCount wordt door de constructor op altijd op 0 gezet.
//3. Maak een een klasse Main met een main-methode. Maak in de main-methode een object aan met deelnemer Jan Visser, email janvisser@hanze.nl.
//- Print het object op de console. Wat zie je?
//            - Maak de constructor private. Kun je de main-methode nog uitvoeren?
//            4. Maak getters voor alle velden
//5. Maak setters voor firstname, lastname en email.
//            6. Schrijf de methode getFullname. Deze geeft de volledige naam terug: voornaam gecombineerd met achternaam.
//            7. Schrijf de methode increaseParticipationCount.
//    Deze verhoogt participationCount met 1.
//            8. Schrijf de methode toString.
//    De string-representatie is: <achternaam>, <voornaam> (<aantal deelnames>x)
//            - Test deze met de eerder geschreven main-methode.
//- Maak toString private. Kun je de main-methode nog uitvoeren?



    // fields
private String firstname;
private String lastname;
private String email;
private int participationCount;



    //constructor
    public Participant(String firstname, String lastname, String email, int participationCount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.participationCount = 0;
    }

///get/set

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getParticipationCount() {
        return participationCount;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFullname(String firstname, String lastname) {

        return (firstname +" "+ lastname);

    }
public void increaseParticipationCount() {
        participationCount += 1;

}

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + email + " " + participationCount;
    }
}
