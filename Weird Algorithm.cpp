#include <bits/stdc++.h>
using namespace std;


int main(){
	cin.sync_with_stdio(0);
    cin.tie(0);
    long long n;
    cin >> n;
    cout << n;
    while(n > 1){
    	if(n% 2 == 0){
    		n/=2;
		}
		else{
			n *= 3;
			n++;
		}
		cout << " " << n;
	}
}
