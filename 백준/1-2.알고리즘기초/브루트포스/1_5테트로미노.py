import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = [list(map(int, input().split())) for _ in range (n)]
visited = [[0 for _ in range (m)] for _ in range(n)]
move = [[1,0],[-1,0],[0,1],[0,-1]]
global ans
ans = 0

def printVisited(visited):
	for i in range(len(visited)):
		print(visited[i])

def dfs(i, j, count, sum):
	global ans
	visited[i][j]=1
	'''
	printVisited(visited)
	print()
	'''

	if count == 3:
		ans = max(sum, ans)
	else:
		for k in range(4):
			next_i = i + move[k][0]
			next_j = j + move[k][1]
			if 0<= next_i < n and 0<= next_j < m and visited[next_i][next_j] == 0:
				dfs(next_i, next_j, count+1, sum+board[next_i][next_j])
				
				if count==1:
					visited[next_i][next_j] = 1
					dfs(i,j,count+1, sum+board[next_i][next_j])
					visited[i][j] = 1
					visited[next_i][next_j] = 0
	
	visited[i][j] = 0

for i in range(n):
	for j in range(m):
		dfs(i, j, 0, board[i][j])

print(ans)