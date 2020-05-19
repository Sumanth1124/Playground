#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];
cin.getline(str,100);     
int count = 0;
//Your code goes here
int i=0; 
  while(1)
  {
    if(str[i]=='\0'&&str[i+1]=='\0'){
      break;
    }
        count++;
    i++;
  }
  for(int i=0;i<count;i++){
  rev[count-1-i]=str[i];
  }
cout<<rev;
}