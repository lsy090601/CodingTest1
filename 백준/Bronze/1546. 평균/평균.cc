#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    
    double scores[1000];
    double max = 0, sum = 0;

    for (int i = 0; i < n; i++) {
        scanf("%lf", &scores[i]);
        if (scores[i] > max) max = scores[i];
    }

    for (int i = 0; i < n; i++) {
        scores[i] = (scores[i] / max) * 100;
        sum += scores[i];
    }

    printf("%.6lf\n", sum / n);

    return 0;
}
