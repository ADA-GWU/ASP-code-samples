#include <stdio.h>
#include <math.h>

double calcCos(double x) {
   return cos(x);
   }

double calcSin(double x) {
   return sin(x);
   }

void calcFunc(double (*f)(double)) {
   for(double  i = 0.0; i < 0.5; i+=0.1) {
     double res = (*f)(i);
     printf("sin(%.2f) = %f \n",i,res); 
     }
}

int main(void)  {
   calcFunc(calcSin);
   return (0);
}

