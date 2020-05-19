#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,sc;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>sc;
  for(int i=0;i<n;i++){
  if(a[i]==sc){
    cout<<"She passed her exam";
    return 0;
  }
  }
  cout<<"She failed";
}