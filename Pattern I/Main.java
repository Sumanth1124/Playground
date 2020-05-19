#include<iostream>
using namespace std;
int main(){
int n;
  cin>>n;
  for(int i=1;i<=4;i++){
  for(int j=0;j<i;j++){
  cout<<n;
  }
    n++;
    cout<<endl;
  }
  n--;
  for(int k=4;k>=1;k--){
      for(int l=0;l<k;l++){
          cout<<n;
      }
      n--;
      cout<<endl;
  }

}