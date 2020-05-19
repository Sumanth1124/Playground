#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,fact=1;
  cin>>n;
  for(int i=n;i>0;i--){
  fact=fact*i;
  }
  cout<<fact;
}