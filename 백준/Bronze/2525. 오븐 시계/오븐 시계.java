import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();  // 현재 시
        int M = scan.nextInt();  // 현재 분
        int C = scan.nextInt();  // 요리 시간 (분)

        int totalMin = H * 60 + M + C; // 전체 분으로 바꾸기
        int resultH = (totalMin / 60) % 24; // 다시 시로, 24시간 초과 방지
        int resultM = totalMin % 60;       // 나머지는 분

        System.out.println(resultH + " " + resultM); // 출력
    }
}
