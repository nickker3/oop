public class main {
    public static void main(String[] args) {



        Participant par = new Participant("nick","bakker","email@addres",0);
        System.out.println(par.getFullname("nick","bakker"));
        System.out.println(par.toString());
        par.increaseParticipationCount();
        System.out.println(par.toString());

        Point p = new Point(4, 6);
        Point x = new Point(7,1);
        System.out.println(p); // (4,6)
        p.moveXY(3,-5);
        System.out.println(p); // (7,1)

        System.out.println(p.equals(x));

    }




}
