import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();

        if (M < 45) {
            H -= 1;
            M += 15; // 60 - (45 - M)
            if (H < 0) {
                H = 23; // 시계는 0~23까지니까
            }
        } else {
            M -= 45;
        }

        System.out.print(H + " ");
        System.out.print(M);
    }
}
