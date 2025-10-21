#include <stdio.h>

int main() {
  int a = 5;
  int b = 5;
  printf("a is %d\n", -a++);
  printf("a now is %d\n", a);
  printf("b is %d\n", -++b);
  printf("b now is %d\n", b);
}
