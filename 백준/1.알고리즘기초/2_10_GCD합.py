import sys
input = sys.stdin.readline

def gcd(a, b):
	large = max(a,b)
	small = min(a,b)

	while True:
		if large%small == 0:
			return small
		else:
			tmp = large%small
			large = small
			small = tmp

t = int(input())
for _ in range(t):
	li = list(map(int, input().split()))
	
	ans=0
	for i in range(1, li[0]):
		for j in range(i+1, li[0]+1):
			ans+=gcd(li[i],li[j])
	print(ans)