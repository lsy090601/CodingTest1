import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> resultList = new ArrayList<>();

        while (true) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }
            resultList.add(num1 + num2);
        }

        for (int result : resultList) {
            System.out.println(result);
        }
    }
}
