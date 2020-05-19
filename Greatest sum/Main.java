#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c];
  int b[r],d[c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  
  for(int i=0;i<r;i++){
int row=0;
  for(int j=0;j<c;j++){
  row+=a[i][j];
  }
    b[i]=row;
  }
  for(int i=0;i<c;i++){
int col=0;
  for(int j=0;j<r;j++){
  col+=a[j][i];
  }
    d[i]=col;
  }
  cout<<"Sum of rows is ";
  int highr=0,rn,highc=0,cn;
  for(int i=0;i<r;i++){
  cout<<b[i]<<" ";
    if(highr<b[i]){
      highr=b[i];
      rn=i;}
  }
  cout<<endl; 
  cout<<"Row "<<rn+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
  cout<<d[i]<<" ";
    if(highc<d[i]){
      highc=d[i];
      cn=i;}
  }
  cout<<endl; 
  cout<<"Column "<<cn+1<<" has maximum sum"<<endl;
  
}