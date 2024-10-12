#include <iostream>

using namespace std;

int main() {
  int a = 50000;
  int b = 90000;

  long long x = (long long)a*b;
  cout<<x<<endl;

  // result is converted to int
  cout<<a*b<<endl;
}
