import sys
input = sys.stdin.readline

n = int(input())
li = [0, 0]
for i in range(2, n+1):
	if i%6==0:
		li.append(min(li[i//3], li[i//2], li[i-1])+1)
	elif i%3==0:
		li.append(min(li[i//3], li[i-1])+1)
	elif i%2==0:
		li.append(min(li[i//2], li[i-1])+1)
	else:
		li.append(li[i-1]+1)

print(li.pop())