#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
int high=0;
  for(int i=0;i<n;i++){
  if(arr[i]>high)
    high=arr[i];
  }
  cout<<high;
}