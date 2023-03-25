import sys
input = sys.stdin.readline

n, bStr = input().split()
b = int(bStr)

ans = 0
for i in range(len(n)):
	if n[len(n)-1-i] >='0' and n[len(n)-1-i] <='9':
		ans += int(n[len(n)-1-i]) *(b**i)
	else:
		ans += (ord(n[len(n)-1-i]) - ord('A') + 10) * (b**i)

print(ans)