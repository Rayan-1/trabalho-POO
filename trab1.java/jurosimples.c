#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

float j,c,i,n;


printf("informe o capital: ");
scanf("%f",&c);

printf("informe a taxa de juros: ");
scanf("%f",&i);

printf("informe o tempo: ");
scanf("%f",&n);

j = c * i * n;

printf("o total de juros e: %.2f ",j);

return 0;
}
