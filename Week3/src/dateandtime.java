import java.time.*;
import java.time.temporal.ChronoUnit;

public class dateandtime
{



    public static void main(String[] args)
    {

        LocalDate dplus = LocalDate.now();
        dplus = dplus.plusDays(100);
        System.out.println(dplus);

        LocalDate sinterklaas = LocalDate.of(2024, 12 ,05);
        System.out.println(sinterklaas.getDayOfWeek());



        LocalDate datum = LocalDate.of(2024, 9, 18); // Stel een datum in
        boolean Woensdag = isWoensdag(datum);

        System.out.println("Is het woensdag? " + Woensdag);

        int dagentotkersttt = aantalDagenTotKerst();
        System.out.println(dagentotkersttt);

    }

    public static boolean isWoensdag(LocalDate datum)
    {
        // Controleer of de gegeven datum een woensdag is
        return datum.getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

    public static int aantalDagenTotKerst()
    {

        LocalDate kdag1 = LocalDate.of(LocalDate.now().getYear(), 12,25);
        LocalDate kdag2 = LocalDate.of(LocalDate.now().getYear(), 12,26);
        LocalDate vdaag = LocalDate.now();

        if(vdaag.isEqual(kdag1) || vdaag.isEqual(kdag2))
        {
            return 0;

        }
        else
            if(vdaag.isBefore(kdag1))
            {
                return (int) ChronoUnit.DAYS.between(vdaag, kdag1);

            }
            else
            if(vdaag.isAfter(kdag1))
            {

                return (int) ChronoUnit.DAYS.between(vdaag, kdag1.plusYears(1));
            }









        return 0;


    }






}




