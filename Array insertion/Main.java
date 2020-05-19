#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n+1];
  for(int i=0;i<n;i++)
  cin>>a[i];
  int loc,ele;
  cin>>loc>>ele;
   if(ele == 0){
    cout<<"Enter the number of elements in the array"<<endl<<"Enter the elements in the array"<<endl;
  cout<<"Enter the location where you wish to insert an element"<<endl;
     cout<<"Invalid Input";
     return 0;
  }
  for(int i=n;i>=loc-1;i--){
    a[i+1]=a[i];
  }
  a[loc-1]=ele;
  cout<<"Enter the number of elements in the array"<<endl<<"Enter the elements in the array"<<endl;
  cout<<"Enter the location where you wish to insert an element"<<endl;
 
  cout<<"Enter the value to insert"<<endl<<"Array after insertion is"<<endl;
  for(int i=0;i<n+1;i++)
    cout<<a[i]<<endl;
}