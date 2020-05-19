#include<iostream>
#include<cmath>
using namespace std;
int main(){
int n;
  cin>>n;
  int count =0;
  float i=0.5;
  
    while(count<n){
      cout<<i<<" ";
      i=i+pow(3,count);
      count++;
    }
}