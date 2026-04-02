function solution(array) {
    let max = array[0];
    let num = 0;

    for (let i = 0; i < array.length; i++) {
        if (max < array[i]) {
            max = array[i];
            num = i;
        }
    }

    return [max, num];
}