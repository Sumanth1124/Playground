#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n];
  int even=0,odd=0;
for(int i=0;i<n;i++){
  cin>>a[i];
  if(a[i]%2==0)
    even++;
  else
    odd++;
}
  cout<<"Enter the number of elements in the array"<<endl<<"Enter the elements in the array"<<endl;
  
  if(even>=1 && odd >=1)
    cout<<"The array is Mixed";
  else if(even ==0 && odd>=1)
    cout<<"The array is Odd";
  else
    cout<<"The array is Even";
}