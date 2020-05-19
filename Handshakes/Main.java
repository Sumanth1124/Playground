#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  cin>>n;
  for(int i=n-1;i>=1;i--){
    count = count+i;
  }
  cout<<count;
}