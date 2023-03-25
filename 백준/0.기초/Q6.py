import sys
input = sys.stdin.readline

n = int(input())
data = []
for _ in range(n):
	data.append(list(map(int, input().split())))

for i in range(n):
	score=1
	for j in range(n):
		if data[i][0] < data[j][0] and data[i][1] < data[j][1]:
			score+=1
	print(score, end=' ')
print()