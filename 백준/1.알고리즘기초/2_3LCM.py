import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
	a,b = map(int, input().split())

	maxab = max(a,b)
	minab = min(a,b)
	gcd = maxab % minab
	while gcd >0:
		maxab = min(maxab, minab)
		minab = gcd
		gcd = maxab%minab
	
	print(a*b//minab)