public class HiFour {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println();
            return;
        }

        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        String name4 = args[3];

        System.out.println("Hallo " + name4 + ", " + name3 + ", " + name2 + ", en " + name1 + "!");
    }
}