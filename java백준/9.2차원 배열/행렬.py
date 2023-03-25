a, b = map(int, input().split())
arrA = []
arrB = []
for _ in range(a):
	arrA.append(list(map(int, input().split())))
for _ in range(a):
	arrB.append(list(map(int, input().split())))

for i in range(3):
	for j in range(3):
		print(arrA[i][j] + arrB[i][j], end= ' ')
	print()