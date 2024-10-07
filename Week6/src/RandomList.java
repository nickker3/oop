import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class RandomList {

        public static void main(String[] args) {

            Random r = new Random();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                list.add(r.nextInt(100));
            }
            System.out.println(list);
            System.out.println(max(list));
        }

        public static int max(List<Integer> list) {
            if (list.isEmpty()) {
                return 0;
            } else
            {
                int max = list.get(0);
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) > max) {
                        max = list.get(i);
                    }
                }
                return max;
            }
        }
    }











