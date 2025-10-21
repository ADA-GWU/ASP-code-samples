#include <stdio.h>

int a = 5;

int fun1() {
  a = 17;
  return 3;
} 

int main() {
  //a = a + fun1();
  a = fun1() + a;
  printf("%d\n",a);
}
