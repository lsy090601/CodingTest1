import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numcount = scan.nextInt();
        int[] numarr = new int[numcount];

        for(int i = 0; i < numcount; i++) {
            numarr[i] = scan.nextInt();
        }

        int num = scan.nextInt(); 
        int count = 0;

        for(int j = 0; j < numcount; j++) {
            if(num == numarr[j]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
