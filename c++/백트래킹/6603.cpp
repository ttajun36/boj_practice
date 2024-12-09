#include <bits/stdc++.h>
using namespace std;

int k;
int s[13] = {0, };
int ans[6] = {0, };

void backTracking(int start, int count){
    if(count==6){
        for(int i=0; i<6; i++)
            cout << ans[i];
        cout << '\n';
    }
    else{
        for(int i=start; i<k; i++){
            ans[count] = s[i];
            backTracking(i+1, count+1);
        }
    }
}

int main(){
    while(true){
        cin >> k;
        if(k==0)
            return 0;
        else{
            for(int i=0; i<k; i++)
                cin >> s[i];
            
            backTracking(0, 0);
            cout << '\n';
        }
    }
}