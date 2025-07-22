import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니 개수
        int M = scan.nextInt(); // 바꿔치기 횟수

        int[] basket = new int[N];

        // 처음에 바구니 번호 = 공 번호
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            // 바꾸기 (인덱스 조정 주의!)
            int temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }

        // 결과 출력
        for (int num : basket) {
            System.out.print(num + " ");
        }
    }
}
