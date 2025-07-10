import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int na = num%4;
        int result = num/4;

        if(na==0){
            for (int i=1; i<=result; i++){
                System.out.print("long ");
            }
            System.out.print("int");
        }

        else{
            for (int i=0; i<=result; i++){
                System.out.print("long ");
            }
            System.out.print("int");
        }


    }
}