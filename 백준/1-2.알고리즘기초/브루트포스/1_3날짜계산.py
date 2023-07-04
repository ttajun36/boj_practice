import sys
input = sys.stdin.readline

e, s, p = map(int, input().split())

ans = 1
while e!=1 or s!=1 or p!=1:
	e -= 1
	s -= 1
	p -= 1
	ans+=1
	
	if e==0:
		e = 15
	if s==0:
		s =28
	if p==0:
		p=19


print(ans)

