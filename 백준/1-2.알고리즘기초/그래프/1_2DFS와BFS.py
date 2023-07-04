'''
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

n, m, v = map(int, input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
	a,b = map(int, input().split())
	graph[a].append(b)
	graph[b].append(a)

visited_dfs = [0 for _ in range(n+1)]
visited_bfs = [0 for _ in range(n+1)]

def dfs(v):
	visited_dfs[v] = 1
	print(v, end=" ")
	graph[v] = sorted(graph[v])

	for i in graph[v]:
		if visited_dfs[i] == 0:
			visited_dfs[i] = 1
			dfs(i)

queue=[]
def bfs(v, bfs_index):
	visited_bfs[v] = 1
	queue.append(v)
	print(v, end=" ")

	for i in graph[v]:
		queue.append(i)
		visited_bfs[i] = 1
	if bfs_index+1 < len(queue):
		bfs2(bfs_index+1)

def bfs2(bfs_index):
	print(queue[bfs_index], end=" ")

	for i in graph[queue[bfs_index]]:
		if visited_bfs[i] == 0:
			queue.append(i)
			visited_bfs[i] = 1
	if bfs_index+1 < len(queue):
		bfs2(bfs_index+1)

dfs(v)
print()
bfs(v,0)
print()
'''

import sys
input = sys.stdin.readline
from collections import deque

n, m, v = map (int, input().split())