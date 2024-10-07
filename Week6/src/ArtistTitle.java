public class ArtistTitle {
//    fields
    String artistName;
    String title;
    int year;



//    constructor


    public ArtistTitle(String artistName, String title, int year) {
        this.artistName = artistName;
        this.title = title;
        this.year = year;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
