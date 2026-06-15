function solution(a, b) {
    const typeA = Number(String(a) + String(b));
    const typeB = 2 * a * b;
    return typeA >= typeB ? typeA : typeB;
}