
  import java.util.List;
import java.util.ArrayList;
public class summationPractice {
 



    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(60);
        number.add(32);
        number.add(41);
        number.add(10);
        number.add(1);

        System.out.println(sum(number));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sumnum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumnum += numbers.get(i);
        }
        return sumnum;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}