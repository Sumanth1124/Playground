#include<iostream>
using namespace std;
int main(){
int n;
  cin>>n;
  int j=6;
  int i=1;
  while(i<=n){
  cout<<j<<" ";
    j=j+5*i;
    i++;
  }
}