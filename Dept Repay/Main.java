#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amt_b,roi,years;
  cin>>amt_b>>roi>>years;
  float intrst,amt,disc,final_amt;
  intrst = amt_b*roi*years/100;
  amt = intrst+amt_b;
  disc = intrst*2/100;
  final_amt= amt-disc;
  cout<<intrst<<endl<<amt<<endl<<disc<<endl<<final_amt<<endl;
}