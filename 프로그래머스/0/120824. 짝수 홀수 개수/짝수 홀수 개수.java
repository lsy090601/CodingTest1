public class Solution {
    public int[] solution(int[] num_list) {
        int evenCount = 0; // 짝수 개수
        int oddCount = 0;  // 홀수 개수

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++; // 짝수일 때
            } else {
                oddCount++;  // 홀수일 때
            }
        }

        return new int[]{evenCount, oddCount};
    }
}