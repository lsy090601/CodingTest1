public class Solution {
    public static int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        // 예시 테스트용
        String str1 = "hello world";
        String str2 = "world";
        
        int result = solution(str1, str2);
        System.out.println(result);  // 결과는 1이 출력될 거야!
    }
}