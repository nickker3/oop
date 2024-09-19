import java.util.Optional;
import java.util.OptionalInt;

public class OpgaveOptionalInt {
    public static void main(String[] args) {
        printBreakeven( 1000, 80, 100 ); // 50
        printBreakeven( 12000, 0.75, 1.30 ); // 21819
        printBreakeven( 2500, 12, 10.5 );




    }

    public static OptionalInt berekenBreakeven(double vasteKosten, double kostenPerEenheid, double opbrengstPerEenheid) {
        double winstPerEenheid = opbrengstPerEenheid - kostenPerEenheid;
        return OptionalInt.of((int)Math.ceil(vasteKosten / winstPerEenheid));
    }

    public static void printBreakeven(double vasteKosten, double kostenPerEenheid, double opbrengstPerEenheid) {
        OptionalInt n=berekenBreakeven(vasteKosten, kostenPerEenheid, opbrengstPerEenheid);
        if(n.getAsInt() < 0){
            System.out.println(n.isEmpty());
        }
            else
            {System.out.println("Break-even punt: "+n+" eenheden.");
        }

    }























}
