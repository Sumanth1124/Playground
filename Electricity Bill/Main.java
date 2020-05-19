#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x;
  if(x<=200){
    y=x*0.5;
  }else if(x>200 && x<=400){
  y=0.65*x+100;
  }else if(x>400 && x<=600){
  y=0.80*x+200;
  }else{
  y=1.25*x+425;
  }
  cout<<"Rs."<<y;
}