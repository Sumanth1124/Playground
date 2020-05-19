#include<iostream>
using namespace std;
int main(){
int x,y;
  cin>>x>>y;
  if(x==y)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else if(y>x)
    cout<<"Sorry, you can't enter";
  else
    cout<<"Yes, you can enter.";
}