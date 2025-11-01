T = int(input())  # 테스트 케이스 개수
for _ in range(T):
    R, S = input().split()
    R = int(R)
    result = ""
    for ch in S:
        result += ch * R  # 문자를 R번 반복
    print(result)
