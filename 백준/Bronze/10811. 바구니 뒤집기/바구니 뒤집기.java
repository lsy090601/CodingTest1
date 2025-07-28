import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); // 바구니 개수
        int M = scan.nextInt(); // 회전 횟수

        int[] arr = new int[N];
        
        // 초기 바구니 상태 세팅 (1부터 N까지)
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = scan.nextInt() - 1; // 시작 인덱스
            int j = scan.nextInt() - 1; // 끝 인덱스

            // 바구니 뒤집기 (역순으로 바꾸기)
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // 결과 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
