import java.sql.SQLOutput;

public class Klasopdr {

    public static void main(String[] args) {

        loop1();
        countVowels("houdini");

    }


    public static void loop1() {
        for (int i = 0; i <= 50; i += 5) {
            System.out.println(i);
        }
    }

    public static void countVowels(String s) {
        int count = 0;
        char x = '0';


        for (int i = 0; i < s.length(); i++) {
            s=s.toLowerCase();
            x = s.charAt(i);

            if        (x == 'a'
                    || x == 'e'
                    || x == 'i'
                    || x == 'o'
                    || x == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}