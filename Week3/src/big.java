public class big {


    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factor(50));

    }


    public static int factorial(int n)
    {
        if(n == 1) {
            return 1;
        }
            return n*factorial(n-1);

    }



public static int factor(int n)
{
    if(n == 1) {
        return 1;
    }
    else

    {
        int a = 1;

       for(int i = 2; i <= n; i++) {
           a=a*i;
           System.out.println(i + ":" + a);
        }
        return a;

    }
}











}
