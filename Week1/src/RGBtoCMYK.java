public class RGBtoCMYK {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Voer 3 waardes in.");
            return;
        }

        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        System.out.println("RGB (" + red + ", " + green + ", " + blue + ")");

        double r = red / 255.0;
        double g = green / 255.0;
        double b = blue / 255.0;

        double k = 1 - Math.max(Math.max(r, g), b);

        double c = (1 - r - k) / (1 - k);
        double m = (1 - g - k) / (1 - k);
        double y = (1 - b - k) / (1 - k);

        System.out.println("CMYK (" + c + ", " + m + ", " + y + ", " + k + ")");
    }
}

