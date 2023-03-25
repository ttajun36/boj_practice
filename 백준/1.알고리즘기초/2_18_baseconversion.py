import sys
input = sys.stdin.readline

a, b = map(int, input().split())
m = int(input())
num = list(map(int, input().split()))

numTen = 0
for i in range(m):
	numTen += num[m-1-i] * (a**i)

ans=[]
while numTen>0:
	ans.append(numTen%b)
	numTen //= b

while ans:
	print(ans.pop(), end=' ')