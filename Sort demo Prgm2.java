import java.util.*;

class TensComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {

        int tensA = (a / 10) % 10;
        int tensB = (b / 10) % 10;

        return tensA - tensB;
    }
}

public class RandomSortDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the lower range:");
        int lower = sc.nextInt();

        System.out.println("Enter the upper range:");
        int upper = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int num = rand.nextInt(upper - lower + 1) + lower;

            if (num % 2 == 0 && num % 5 == 0) {

                list.add(num);
            }
        }

        System.out.println("Numbers before sorting:");
        System.out.println(list);

        Collections.sort(list, new TensComparator());

        System.out.println("Numbers after sorting based on Tens position:");
        System.out.println(list);
    }
}
