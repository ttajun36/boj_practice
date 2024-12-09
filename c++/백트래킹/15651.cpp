#include <bits/stdc++.h>
using namespace std;
#define MAX 8

int n, m;
int ans[MAX] = {0, };

void backTracking(int count){
    if(count == m){
        for(int i=0; i<count; i++)
            cout << ans[i] << ' ';
        cout << '\n';
    }
    else{
        for(int i=1; i<n+1; i++){
            ans[count] = i;
            backTracking(count+1);
        }
    }
}

int main(){
    cin >> n >> m;

    backTracking(0);
}