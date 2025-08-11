import sys

input = sys.stdin.readline
n = int(input().strip())
s = input().strip()  # 공백 없이 붙어있는 숫자들

total = sum(ord(c) - ord('0') for c in s)
print(total)
