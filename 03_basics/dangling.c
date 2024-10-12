#include <stdio.h>

int * p;
void test() {
  int a = 12;
  p = &a;
}

int main() {
  test();

  printf("Pointer refers to a cell with value: %d",*p);
} 
