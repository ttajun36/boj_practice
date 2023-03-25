import sys
input = sys.stdin.readline

n = int(input())
li = list(map(int, input().split()))
dp = [[0,0] for row in range(n)]
dp[0] = [1, -1]
for i in range(1, n):
	dp[i] = [1, -1]

	for j in range(i):
		if li[i] > li[j] and dp[i][0] < dp[j][0] +1:
			dp[i][0] = dp[j][0]+1
			dp[i][1] = j

max = -1
for i in range(n):
	if dp[i][0] > max:
		max = dp[i][0]
		maxIndex = i

print(dp[maxIndex][0])

ans = []
while maxIndex != -1:
	ans.append(li[maxIndex])
	maxIndex = dp[maxIndex][1]

for i in range(len(ans)-1, -1,-1):
	print(ans[i], end=' ')
print()