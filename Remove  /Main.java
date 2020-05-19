#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string a;
  getline(cin,a);
  int pos=-1;
  while(1){
  int pos=a.find(" the ");
  if(pos==-1){
  break;
  }
  a.erase(pos,4);
  pos=-1;
  }
  cout<<a;
}