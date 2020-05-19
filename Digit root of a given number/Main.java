#include<iostream>
using namespace std;
int sum;
int func1(int n){
  
if(n<=9)
  return sum+n;
  else{
  sum=sum+n%10;
    func1(n/10);
  }
}
int func(int n){
if(n<=9)
  return n;
  else{
      sum=0;
    int z=func1(n);
  func(z);
  }
}

int main(){
int n;
  cin>>n;
 int c= func(n);
  cout<<c;
}

