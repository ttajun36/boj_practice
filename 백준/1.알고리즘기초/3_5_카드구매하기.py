import sys
input = sys.stdin.readline

n = int(input())
price = list(map(int, input().split()))
li = []

for i in range(n):
	tmp = [price[i]]
	for j in range(0, i):
		tmp.append(li[j]+price[i-j-1])
	li.append(max(tmp))

print(li[n-1])