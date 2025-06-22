import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int result1 = (num1+num2)%num3;
        int result2 = ((num1%num3)+(num2%num3))%num3;
        int result3 = (num1*num2)%num3;
        int result4 = ((num1%num3)*(num2%num3))%num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}