#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,no;
  cin>>n;
  int temp=n;
  for(int i=n;i>0;i=i/10){
  no++;
  }
  int square = temp*temp;
  
  int c=pow(10,no);
  int a=square/c;
  int b=square%c;
  if((a+b)==temp){
  cout<<"Kaprekar Number";
  }else{
  cout<<"Not a Kaprekar Number";
  }
  
}