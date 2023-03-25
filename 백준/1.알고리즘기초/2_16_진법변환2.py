import sys
input = sys.stdin.readline

n, b = map(int, input().split())
ans = ''
while n>0:
	if n%b<10:
		ans = str(n%b) + ans
	else:
		ans = chr(ord('A') + n%b-10) + ans
	n//=b

print(ans)