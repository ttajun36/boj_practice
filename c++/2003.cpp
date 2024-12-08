#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    int a[n];
    for(int i=0; i<n; i++){
        cin >> a[i];
    }

    int first = 0;
    int second = 0;
    int sum = 0;
    int ans = 0;

    while(second < n){
        for(int i=first; i<second+1; i++){
            sum += a[i];
        }
        
        if (sum==m){
            ans +=1;
            second += 1;
        }
        else if (sum < m)
            second += 1;
        else 
            first += 1;

        sum = 0;
    }


    cout << ans << '\n';
}
