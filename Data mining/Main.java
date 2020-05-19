#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int odd=0,even=0;
  for(int i=n;i>0;i=i/10){
  int r=i%10;
    if(r%2==0){
    even =even+r;
    }else{
    odd=odd+r;
    }
    
  }
  if(even==odd){
  cout<<"Yes";
  }
  else{
  cout<<"No";
  }
}