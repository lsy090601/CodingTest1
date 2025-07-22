import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니 개수
        int M = scan.nextInt(); // 작업 수
        int[] basket = new int[N]; // 바구니 배열

        for (int m = 0; m < M; m++) {
            int i = scan.nextInt(); // 시작 바구니
            int j = scan.nextInt(); // 끝 바구니
            int k = scan.nextInt(); // 넣을 공 번호

            for (int x = i - 1; x <= j - 1; x++) {
                basket[x] = k; // 공을 넣기
            }
        }

        for (int x = 0; x < N; x++) {
            System.out.print(basket[x] + " ");
        }
    }
}
