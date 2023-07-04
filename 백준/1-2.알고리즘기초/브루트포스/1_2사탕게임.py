import sys
input = sys.stdin.readline

def checkMax(board):
	maxCandy = 0
	temp = 1
	for i in range(n):
		for j in range(1, n):
			if board[i][j] == board[i][j-1]:
				temp += 1
			else:
				maxCandy = max(maxCandy, temp)
				temp=1
		
		maxCandy = max(maxCandy, temp)
		temp=1

	for i in range(n):
		for j in range(1, n):
			if board[j][i] == board[j-1][i]:
				temp += 1
			else:
				maxCandy = max(maxCandy, temp)
				temp=1

			if temp > maxCandy:
				maxCandy = temp
		
		maxCandy = max(maxCandy, temp)
		temp=1

	return maxCandy

def swap(board, a, b, c, d):
	temp = board[a][b]
	board[a][b] = board[c][d]
	board[c][d] = temp

n = int(input())
board = []
for i in range (n):
	board.append(list(input().rstrip()))
ans = checkMax(board)


for i in range(n):
	for j in range(n):
		if j != n-1:
			swap(board, i, j, i, j+1)
			ans = max(ans, checkMax(board))
			swap(board, i, j, i, j+1)
		if i != n-1:
			swap(board, i, j, i+1, j)
			ans = max(ans, checkMax(board))
			swap(board, i, j, i+1, j)			

print(ans)