import sys
input = sys.stdin.readline

G = int(input())
P = int(input())

gate = [i for i in range(G+1)]
ans = 0
for _ in range(P):
	g_i = int(input())
	next_gate = gate[g_i]
	if next_gate == 0:
		break
	else:
		ans += 1
	
	left = g_i
	while(gate[left] != gate[g_i]):
		left -= 1
	for i in range(left+1, G+1):
		if gate[i] != next_gate:
			break
		else:
			gate[i] = gate[left]

print(ans)