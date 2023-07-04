import sys
input = sys.stdin.readline

n, m = map(int, input().split())
friend = [[] for _ in range(n)]
visited = [0  for _ in range(2000)]

for _ in range(m):
	a, b = map(int, input().split())
	friend[a].append(b)
	friend[b].append(a)

depth = 0
global ans = False

def dfs(i, depth):
	global ans
	if depth == 4:
		ans = True
		return

	visited[i] = 1
	for j in friend[i]:
		if visited[j] == 0:
			dfs(j, depth+1)
	visited[i] = 0

for i in range(n):
	dfs(i, depth)


if ans:
	print (1)
else:
	print(0)