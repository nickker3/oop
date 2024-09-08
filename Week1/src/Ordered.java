public class Ordered {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Voer precies 3 gehele getallen in");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);


        boolean isOrdered = (x < y && y < z) || (x > y && y > z);

        System.out.println(isOrdered);
    }
}
