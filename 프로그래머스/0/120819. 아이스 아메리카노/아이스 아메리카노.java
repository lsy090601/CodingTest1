public class Solution {
    public int[] solution(int money) {
        int price = 5500; // 아메리카노 한 잔 가격
        int count = money / price; // 마실 수 있는 잔 수
        int change = money % price; // 남는 돈

        return new int[]{count, change};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(15000); // 예시 테스트
        System.out.println("아메리카노: " + result[0] + "잔, 남는 돈: " + result[1] + "원");
    }
}