#include <stdio.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int* solution(int numbers[], size_t numbers_len, int num1, int num2) {
    int size = num2 - num1 + 1;  // 반환할 배열 크기
    int* answer = (int*)malloc(sizeof(int) * size);  // 동적 메모리 할당

    if (answer == NULL) {
        // 메모리 할당 실패 시
        return NULL;
    }

    for (int i = 0; i < size; i++) {
        answer[i] = numbers[num1 + i];
    }

    return answer;
}