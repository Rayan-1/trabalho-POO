#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

float a,b,c,x1,x2,delta;

printf("informe o valor do termo A: ");
scanf("%f",&a);
printf("informe o valor do termo B: ");
scanf("%f",&b);
printf("informe o valor do termo C: ");
scanf("%f",&c);

//calcula o valor da equação

delta = b * b - 4 * a * c;
x1 = (-b + sqrt(delta)) / (2*a);
x2 = (-b - sqrt(delta)) / (2*a);

//imprime os resultados

if(delta < 0){
printf("Equacao nao possui raiz");
}else{
printf("o valor de x1 : %.2fn", x1);
printf("o valor de x2 : %.2fn", x2);
}

system("pause");
return 0;


}
