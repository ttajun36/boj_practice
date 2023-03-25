import sys
input = sys.stdin.readline

li = [1,1,2]

for i in range(3, 11):
	li.append(li[i-1] + li[i-2] + li[i-3])

t = int(input())
for _ in range(t):
	n = int(input())
	print(li[n])