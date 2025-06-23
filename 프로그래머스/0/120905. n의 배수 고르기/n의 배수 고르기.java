class Solution {
    public int[] solution(int n, int[] numlist) {
       int count = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                count++;
            }
        }
        int answer[] = new int [count];
        
        int num = 0;
        for(int j=0; j<numlist.length; j++){
            if(numlist[j]%n==0){
                answer[num] = numlist[j];
                num++;
            }
        }
        return answer;
    }
}