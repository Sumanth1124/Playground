#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int tempt=n;
  int sum=0;
  for(int i=n;i>0;i=i/10){
  int r=i%10;
    sum=sum+r;
  }
  if(tempt%sum==0){
  cout<<"Harshad Number";
  }else{
  cout<<"Not Harshad Number";
  }
}