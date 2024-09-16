import java.time.LocalDate;
import java.time.LocalDateTime;

public class dateandtime
{

    public static void main(String[] args)
    {

        LocalDate dplus = LocalDate.now();
        dplus = dplus.plusDays(100);
        System.out.println(dplus);

        LocalDate sinterklaas = LocalDate.of(2024, 12 ,05);
        System.out.println(sinterklaas.getDayOfWeek());

    }

    public static boolean woensdagofniet(LocalDate datum){


        LocalDate woensdag = LocalDate.of(datum);
        
    }



}
