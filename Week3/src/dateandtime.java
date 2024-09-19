import java.time.*;
import java.time.temporal.ChronoUnit;

public class dateandtime
{


//    Op welke weekdag valt 10 januari 1965?
//
//    Op welke weekdag viel nieuwjaarsdag (1 januari) in het huidige kalenderjaar?
//
//    Wat is de datum vijf weken na vandaag?
//
//    Hoeveel dagen is het geleden dat Nederland het Europees kampioenschap voetbal won (op 25 juni 1988)?



    public static void main(String[] args)
    {
        System.out.println(LocalDate.of(1965,1,10).getDayOfWeek());
        System.out.println(LocalDate.of(LocalDate.now().getYear(),1,1 ).getDayOfWeek());
        System.out.println(LocalDate.now().plusWeeks(5));
        System.out.println(ChronoUnit.DAYS.between( LocalDate.now() , LocalDate.of(1998,06,25)));


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

        System.out.println(eerstVolgendKerstInWeekend());

        System.out.println(aantalVrijdagDe13e(2024));



    }

    public static boolean isWoensdag(LocalDate datum)
    {
        // Controleer of de gegeven datum een woensdag is
        return datum.getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

    public static int eerstVolgendKerstInWeekend()
    {

        LocalDate kdag1 = LocalDate.of(LocalDate.now().getYear(), 12,25);
        LocalDate kdag2 = LocalDate.of(LocalDate.now().getYear(), 12,26);

        if((kdag1.getDayOfWeek() == DayOfWeek.SATURDAY) && (kdag2.getDayOfWeek() == DayOfWeek.SUNDAY))
        {
            return LocalDate.now().getYear();
        } else
        {
            while(kdag1.getDayOfWeek() != DayOfWeek.SATURDAY)
            {
                kdag1 = kdag1.plusYears(1);

            }
            return kdag1.getYear();

        }

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

    public static int aantalVrijdagDe13e(int jaartal)
    {
        int maand = 1;

        int aantalvrijdagen = 0;


        while(maand < 13)
        {
            LocalDate dag13 = LocalDate.of(jaartal,maand,13);

            if(dag13.getDayOfWeek() == DayOfWeek.FRIDAY){
                aantalvrijdagen++;
                maand++;
            }
            else maand++;

        }

        return aantalvrijdagen;


    }

}




