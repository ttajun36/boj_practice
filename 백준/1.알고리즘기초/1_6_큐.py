import sys
input = sys.stdin.readline

n = int(input())

queue = []
for _ in range(n):
	command = input().split()

	if command[0] == "push":
		queue.append(int(command[1]))
	elif command[0] == "pop":
		if len(queue) == 0:
			print(-1)
		else:
			print(queue[0])
			del(queue[0])
			#del을 pop에서 쓸 것인지 insert를 push에서 쓸 것인지
	elif command[0] == "size":
		print(len(queue))
	elif command[0] == "empty":
		if len(queue) == 0:
			print(1)
		else:
			print(0)
	elif command[0] == "front":
		if len(queue) == 0:
			print(-1)
		else:
			print(queue[0])
	elif command[0] == "back":
		if len(queue) == 0:
			print(-1)
		else:
			print(queue[-1])
	