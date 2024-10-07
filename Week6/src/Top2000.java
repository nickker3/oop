import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Top2000 {


    public static void main(String[] args) throws Exception {
        System.out.println(jaarOudsteNotering("top2000.txt"));






        try (
                BufferedReader r = new BufferedReader(new FileReader("top2000.txt"));
        ) {
            String line;
            while ((line = r.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] delen = line.split("\t", 4);
                    //System.out.println(delen[0] + "-" + delen[1] + "-" + delen[2]);
                    int jaar = Integer.parseInt(delen[0]);
                    String artiest = delen[1].trim();
                    String nummer = delen[2].trim();
                    ArtistTitle Artisttitle = new ArtistTitle(artiest,nummer,jaar);

                    jaarOudsteNotering(Artisttitle)

                }
            }
        } catch (IOException e) {
            System.out.println("fout");
        }
    }


    public static int jaarOudsteNotering(ArrayList hitlijst) {
        System.out.println(hitlijst.size());


    }
}











