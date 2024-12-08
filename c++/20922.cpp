#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    int a[n];
    for(int i=0; i<n; i++)
        cin >> a[i];

    int first = 0;
    int second = 0;
    int count[100001];
    int max=1;
    int ans = -1;

    for(int i=0; i<100001; i++)
        count[i] = 0;

    count[a[0]]++;

    while(true){
        if (max > k){
            count[a[first]]--;
            if(a[first] == a[second])
                max--;
            first += 1;
        }
        if (max <= k){
            if(ans < second-first+1)
                ans = second-first+1;

            second ++;
            if(second == n)
                break;

            count[a[second]]++;
            if(count[a[second]]>max)
                max++;
        }
    }
    cout << ans << '\n';
}