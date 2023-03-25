import sys
input = sys.stdin.readline

def gcd(a, b):
	large = max(a,b)
	small = min(a,b)
	while True:
		if large%small==0:
			return small
		else:
			tmp = large%small
			large = small
			small = tmp

n, s = map(int, input().split())
li = list(map(int, input().split()))

if n==1:
	print(max(s, li[0]) - min(s, li[0]))
else:
	ans = gcd(max(s, li[0]) - min(s, li[0]), max(s, li[1]) - min(s, li[1]))
	for i in range(2, n):
		ans = gcd(ans, max(s, li[i]) - min(s, li[i]))
	print(ans)