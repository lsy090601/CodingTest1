#include <stdio.h>

int solution(int n) {
    int total = 0; 

    for (int i = 0; i <= n; i++) {
      
        if (i % 2 == 0) {
            total += i; 
        }
    }
    
    return total; 
}

int main() {
    int n;
    printf("정수를 입력하세요: ");
    scanf("%d", &n);
    
    int result = solution(n);
    printf("0부터 %d까지의 짝수의 합: %d\n", n, result);
    
    return 0;
}
