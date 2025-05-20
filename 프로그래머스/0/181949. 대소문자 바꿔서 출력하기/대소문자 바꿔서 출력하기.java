import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            // 대문자인 경우
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // 소문자인 경우
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            // 알파벳이 아닌 다른 문자는 그대로 추가
            else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}