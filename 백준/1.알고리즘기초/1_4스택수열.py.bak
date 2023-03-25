'''
import sys
input = sys.stdin.readline

n = int(input())
sequence = []
for _ in range(n):
	sequence.append(int(input()))

stack1 = []
for i in range(n):
	stack1.append(n-i)
stack = []
ans = []

for i in sequence:
	if len(stack1) > 0:
		if stack1[-1] <= i:
			while stack1[-1] <i:
				stack.append(stack1.pop())
				ans.append('+')
			stack.append(stack1.pop())
			ans.append('+')
			stack.pop()
			ans.append('-')
			continue

	temp = stack.pop()
	if temp != i:
		print("NO")
		ans=[]
		break
	else:
		ans.append('-')

for operation in ans:
	print(operation)
'''

import sys
input = sys.stdin.readline

n = int(input())
stack = []
ans = []
count = 1

for _ in range(n):
	a = int(input())
	
	if count <= a:
		while count <= a:
			stack.append(count)
			ans.append('+')
			count+=1
	
	if stack.pop() == a:
		ans.append('-')
	else:
		ans = []
		print("NO")
		break

for operation in ans:
	print(operation)
