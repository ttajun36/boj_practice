import sys
input = sys.stdin.readline

stack = []
queue = []
count = 0

s = input().rstrip()
ans = []
for letter in s:
	if letter == '<':
		while stack:
			ans.append(stack.pop())
		count += 1
	elif letter == '>':
		while queue:
			ans.append(queue[0])
			del(queue[0])
		ans.append('>')
		count -= 1
		continue
	elif letter == ' ':
		if count == 0:
			while stack:
				ans.append(stack.pop())
			ans.append(' ')
			continue
		
	if count==0:
		stack.append(letter)
	else:
		queue.append(letter)

while stack:
	ans.append(stack.pop())
	
for i in range(len(ans)):
	print(ans[i], end='')

print()