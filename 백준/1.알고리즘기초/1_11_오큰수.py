'''
import sys
input = sys.stdin.readline

n = int(input())
data = list(map(int, input().split()))
ans = [0 for _ in range(n)]
index_arr = [0 for _ in range(n)]
ans[-1] = -1
index_arr[-1] = n-1


for i in range(n-1):
	index = n-2-i
	new_index = index+1
	value = data[new_index]

	while True:
		if data[index] < value:
			ans[index] = value
			index_arr[index] = new_index
			break
		else:
			if ans[new_index] == -1:
				ans[index] = -1
				break
			new_index = index_arr[new_index]
			value = data[new_index]

for i in range(n):
	print(ans[i], end=' ')
print()
'''
'''
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
stack = [0]
ans = []

for i in range(n):
	while True:
		if a[n-1-i] > stack[-1]:
			stack.pop()
		else:
			ans.append(stack[-1])
			stack.append(a[n-1-i])
			break
		
		if len(stack) == 0:
			stack.append(a[n-1-i])
			ans.append(-1)
			break

while ans:
	print(ans.pop(), end=' ')
print()
'''
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

stack = [0]
ans = [-1]*n

for i in range(1, n):
	while stack and a[stack[-1]] < a[i]:
		ans[stack.pop()] = a[i]
	stack.append(i)
	
	
print(*ans)
	