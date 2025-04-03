#include <stdio.h>

int main(void) {
    int a;
    scanf("%d", &a);
    int num1 = a%2;
    if(num1 == 0)
    {
        printf("%d is even",a);
    }

    else
    printf("%d is odd",a);
    
    return 0;
}