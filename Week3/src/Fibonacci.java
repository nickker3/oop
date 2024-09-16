//import java.math.BigInteger;
//public class Fibonacci {
//
//
//
//
//
//    public static BigInteger fib(int n) {
//        if (n == 0) {
//           return BigInteger.ZERO;
//        }
//
//        BigInteger a = BigInteger.ZERO;
//        BigInteger b = BigInteger.ONE;
//        BigInteger volgende = BigInteger.ZERO;
//
//        for (int i = 2; i <= n; i++) {
//            volgende = a.add(b);
//            a = b;
//            b = volgende;
//        }
//
//        return b;
//    }
//
//    public static void main(String[] args) {
//
//        Fibonacci fibonacci = new Fibonacci();
//
//        for (int i = 0; i <= 1000000; i++) {
//            System.out.println(i + " - " + fibonacci.fib(i));
//        }
//    }
//}
