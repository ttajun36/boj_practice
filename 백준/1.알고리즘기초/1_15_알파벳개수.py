word = input()

ans = [0]*(ord('z')-ord('a')+1)
for i in word:
	ans[ord(i)-ord('a')] +=1

print(*ans)