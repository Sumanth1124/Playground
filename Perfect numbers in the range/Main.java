#include<iostream>
using namespace std;
int main(){
int x,y,count=0;
  cin>>x>>y;
  for(int i=x;i<=y;i++){
    int sum=0;
  for(int j=1;j<i;j++){
  if(i%j==0){
  sum=sum+j;
  }
  }
    if(sum==i){
    cout<<i<<" ";}
  }

}