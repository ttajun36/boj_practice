import sys
input = sys.stdin.readline

n = int(input())
data = list(map(int, input().split()))

dp_left = [1 for _ in range(n)]
dp_right = [0 for _ in range(n)]

for i in range(n):
	for j in range(i):
		if data[i] > data[j]:
			dp_left[i] = max(dp_left[i], dp_left[j]+1)

for i in range(n-1, -1, -1):
	for j in range(n-1, i, -1):
		if data[i] > data[j]:
			dp_right[i] = max(dp_right[i], dp_right[j] +1)

dp = [0 for _ in range(n)]
for i in range(n):
	dp[i] = dp_left[i] + dp_right[i]
print(max(dp))

