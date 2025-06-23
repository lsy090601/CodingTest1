import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();  // 첫 번째 수
        int num2 = scan.nextInt();  // 두 번째 수

        int one = num2 % 10;         // 일의 자리
        int ten = (num2 / 10) % 10;  // 십의 자리
        int hundred = num2 / 100;    // 백의 자리

        System.out.println(num1 * one);
        System.out.println(num1 * ten);
        System.out.println(num1 * hundred);
        System.out.println(num1 * num2);
    }
}