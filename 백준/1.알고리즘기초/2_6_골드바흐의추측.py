r = 1000001
prime = [True for _ in range(r)]
for i in range(2, int(r**(1/2))):
	if prime[i]:
		for j in range(3*i, r, 2*i):
			prime[j] = False

import sys
input = sys.stdin.readline

while True:
	a = int(input())
	if a==0:
		break
	else:
		for i in range(3, a//2+1,2):
			if prime[i] and prime[a-i]:
				print("%d = %d + %d"%(a, i, a-i))
				break
