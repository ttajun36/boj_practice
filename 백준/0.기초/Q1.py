'''
n = int(input())

star = [[' ' for _ in range(n)] for _ in range(n)]

def put_star(star, start_index, len):
	if len == 3:
		for i in range(3):
			for j in range(3):
				if i!=1 or j!=1:
					star[start_index[0]+i][start_index[1]+j] = '*'
	else:
		len //= 3
		for i in range(3):
			for j in range(3):
				if i!=1 or j!=1:
					put_star(star, [start_index[0]+len*i, start_index[1]+len*j], len)

put_star(star, [0,0], n)

for i in range(n):
	for j in range(n):
		print(star[i][j], end='')
	print()
'''

def draw_stars(n):
  if n==1:
    return '*'

  Stars=draw_stars(n//3)
  L=[]

  for star in Stars:
    L.append(star*3)
  for star in Stars:
    L.append(star+' '*(n//3)+star)
  for star in Stars:
    L.append(star*3)

  return L

N=int(input())
print('\n'.join(draw_stars(N)))