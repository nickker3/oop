import java.math.BigInteger;

public class big {


    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factor(BigInteger.valueOf(50000)));

    }


    public static int factorial(int n)
    {
        if(n == 1) {
            return 1;
        }
            return n*factorial(n-1);

    }



public static BigInteger factor(BigInteger n)
{
    if(n.equals(BigInteger.ONE)) {
        return BigInteger.ONE;
    }
    else

    {
        BigInteger a = BigInteger.ONE;

//for(BigInteger i = BigInteger.TWO ; i <= n; i++)
        for(BigInteger i = BigInteger.TWO ; !i.equals(n); i = i.add(BigInteger.ONE))
       {
           a=a.multiply(i);
           System.out.println(i + ":" + a);
        }
        return a;

    }
}











}
