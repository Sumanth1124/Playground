#include<iostream>
using namespace std;
void swap(int &a,int &b){
a=a+b;
  b=a-b;
  a=a-b;
}
int main(){
int p,q;
  cin>>p>>q;
  cout<<"Before swapping a= "<<p<<" and b="<<q<<endl;
  swap(p,q);
  cout<<"After swapping a= "<<p <<" and b="<<q;
}