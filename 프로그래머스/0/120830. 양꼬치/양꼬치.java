class Solution {
    public int solution(int n, int k) {
         int num1 = n/10;
    int num2 = k-num1;
    int num3 = n*12000+num2*2000;
    return num3;
    }
}