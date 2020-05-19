#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,z;
  float y,p=13.30;
  cin>>x>>y;
  if(y==p){
    if(x>13)
    z=5;
    else
    z=2;
  }else{
  if(x>13)
    z=8;
    else
    z=4;
  }
  cout<<"$"<<z<<".00";
}