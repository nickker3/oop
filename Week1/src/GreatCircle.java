public class GreatCircle {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Voer precies 4 waarden in");
            return;
        }

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);

        double distance = 60 * Math.toDegrees(Math.acos(Math.sin(x1Rad) * Math.sin(x2Rad)
                + Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad - y2Rad)));

        System.out.println("De grootcirkelafstand is: " + distance + " zeemijlen.");
    }
}
