import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int fac = 0;
        for(int i=1;i<=num1;i++){
            fac+=i;
        }
        System.out.println(fac);
    }
}
