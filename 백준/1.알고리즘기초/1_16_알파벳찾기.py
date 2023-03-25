s = input()

ans = [-1]*(ord('z')-ord('a')+1)
for i in range(len(s)):
	if ans[ord(s[i])-ord('a')] == -1:
		ans[ord(s[i])-ord('a')] = i
print(*ans)