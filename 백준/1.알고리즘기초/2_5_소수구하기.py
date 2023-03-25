import sys
input = sys.stdin.readline

m, n = map(int, input().split())

if n>1:
	prime = [2]
	if m==2:
		print(2)
	for i in range(3, n+1):
		for j in range(len(prime)):
			if i%prime[j]==0:
				break

			if prime[j] > i**(1/2):
				prime.append(i)
				if i>=m:
					print(i)
				break