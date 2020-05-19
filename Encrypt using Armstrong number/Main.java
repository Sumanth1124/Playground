#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp=n,temp1=n,count=0,sum=0;
  for(int i=n;i>0;i=i/10){
  count++;
  }
  for(int j=temp;j>0;j=j/10){
  int r=j%10;
    sum=sum+power(r,count);
  }
  if(temp1==sum)
    return 1;
    else
      return 0;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}