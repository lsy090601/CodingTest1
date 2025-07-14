import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}
