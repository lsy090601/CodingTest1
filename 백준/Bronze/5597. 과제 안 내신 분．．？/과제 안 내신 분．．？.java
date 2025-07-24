import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] submitted = new boolean[31]; // 0번 인덱스는 안 씀

        for (int i = 0; i < 28; i++) {
            int num = scan.nextInt();
            submitted[num] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
