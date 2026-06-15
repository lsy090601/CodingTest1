function solution(num_list) {
    var answer = 0;
    var s = 0; // 합을 저장할 변수
    var m = 1; // 곱을 저장할 변수
    
    for(let i = 0; i < num_list.length; i++){
        m *= num_list[i];
        s += num_list[i];
    }
    
    // 합의 '제곱'과 비교해야 하므로 s * s 로 수정합니다.
    if(m < s * s){
        answer = 1;
    }
    else {
        answer = 0;
    }
    
    return answer;
}