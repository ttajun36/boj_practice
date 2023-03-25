import sys
input = sys.stdin.readline

n = int(input())
data = list(map(int, input().split()))

count=0
for i in range (n):
	if data[i] == 1:
		continue
	else:
		prime = True
		for j in range(2, data[i]):
			if data[i] % j == 0:
				prime = False
				break
		
		if prime == True:
			count+=1

print(count)