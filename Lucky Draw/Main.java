#include<iostream>
using namespace std;
int main(){
int n,count=0;
  cin>>n;
  for(int i=n;i>=1;i--){
  if(n%i==0)
    count++;
  }
  if(count==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";

}