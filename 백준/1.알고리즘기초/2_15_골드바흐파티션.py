import sys
input = sys.stdin.readline

prime = [True for i in range(1000001)]
for i in range(3, len(prime), 2):
	if prime[i] == True:
		for j in range(3*i, len(prime), 2*i):
			prime[j] = False


t = int(input())
for i in range(t):
	count = 0
	
	n = int(input())
	if n==4:
		count = 1
	for j in range(3, n//2+1, 2):
		if prime[j]==True and prime[n-j]==True:
			count+=1
	
	print(count)