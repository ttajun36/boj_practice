#include <bits/stdc++.h>
using namespace std;

int n, m;
int ans[9] = {0, };
int visited[9] = {0, };

void backTracking(int count){
    if (count == 0){
        for(int i=0; i<m; i++){
            cout << ans[i] << ' ';
        }
        cout << '\n';
    }
    else{
        for(int i=1; i<n+1; i++){
            if(visited[i]==0){
                visited[i]=1;
                ans[m-count] = i;
                backTracking(count-1);
                visited[i]=0;
            }
        }
    }
}

int main() {
    cin >> n >> m;

    backTracking(m);
}