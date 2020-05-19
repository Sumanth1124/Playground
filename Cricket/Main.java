#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
     int p,q,r,s;
  cin>>p>>q>>r>>s;
  int overs;
  float over_f,crr,trr;
  overs=p/6;
  over_f=s/6+(0.1*(s%6));
  crr=r/over_f;
  trr=(float)q/overs;
  cout<<overs<<endl<<over_f<<endl;
  printf("%.1f\n",crr);
  printf("%.1f\n",trr);
  if(crr<trr){
    cout<<"Not Eligible to Win";
  }
  else{
    cout<<"Eligible to Win";
  }
}