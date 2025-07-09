import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int good = scan.nextInt();
        int price[] = new int[good];
        int num[] = new int[good];
        int totalprice=0;

        for(int i=0; i<good;i++){
            price[i]= scan.nextInt();
            num[i] = scan.nextInt();
            totalprice+=(price[i]*num[i]);
        }

        if(total==totalprice){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
