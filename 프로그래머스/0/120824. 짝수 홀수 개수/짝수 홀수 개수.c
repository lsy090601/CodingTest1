#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len) {
    int evenCount = 0; // 짝수 개수
    int oddCount = 0;  // 홀수 개수

    for (size_t i = 0; i < num_list_len; i++) {
        if (num_list[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    int* answer = (int*)malloc(sizeof(int) * 2); // 결과를 담을 배열 동적 할당
    answer[0] = evenCount;
    answer[1] = oddCount;

    return answer;
}