'''
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = []
for _ in range(n):
	board.append(input())

def countBoard(board, a, b):
	count=0
	count2=0
	if board[a][b] == 'W':
		for i in range(8):
			for j in range(8):
				if (i+j)%2 == 0:
					if board[a+i][b+j] =='B':
						count+=1
					else:
						count2+=1
				else:
					if board[a+i][b+j] == 'W':
						count+=1
					else:
						count2+=1

	else:
		for i in range(8):
			for j in range(8):
				if (i+j)%2 == 0:
					if board[a+i][b+j] =='W':
						count+=1
					else:
						count2+=1
				else:
					if board[a+i][b+j] == 'B':
						count+=1
					else:
						count2+=1
	return min(count, count2)

minimum = 65
for i in range(n-7):
	for j in range(m-7):
		if minimum > countBoard(board, i, j):
			minimum = countBoard(board, i, j)

print(minimum)
'''
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = []
for _ in range(n):
	board.append(input())

minimum = 65

for i in range(n-7):
	for j in range(m-7):
		count1, count2 = 0, 0
		for a in range(i, i+8):
			for b in range(j, j+8):
				if (a+b)%2==0:
					if board[a][b]=='W':
						count1 += 1
					else:
						count2 +=1
				else:
					if board[a][b]=='B':
						count1+=1
					else:
						count2+=1
		if minimum > min(count1, count2):
			minimum = min(count1, count2)

print(minimum)