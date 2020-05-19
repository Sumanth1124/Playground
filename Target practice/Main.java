#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s;
  cin>>s;
  int sum=0,count=0;
  while(1){
  int n;
    cin>>n;
    if(sum>=s){
    cout<<"The number of turns is "<<count;
      return 0;
    }
    sum=sum+n;
    count++;
  }
}