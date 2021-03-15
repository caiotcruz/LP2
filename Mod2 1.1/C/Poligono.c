#include <stdio.h>

//Struct em C para poligono qualquer//
typedef struct {
    int Xini,Yini;
    int Xnovo, Ynovo;
    int QuantidadeDeRetas;

}Poligono;


//Função printar para poligono qualquer//
void printar (Poligono* p){
    if (p->Xini && p->Yini != p->Xnovo, p->Ynovo){
        printf("\nNovo ponto na posição %d, %d \n", p->Xnovo, p->Ynovo);
        p->QuantidadeDeRetas += 1;
    }
    printf("\nPoligono com %d lados\n", p->QuantidadeDeRetas);
}


//Funcionamento da Struct com a função printar//
void main(void){
	Poligono P1;
	printf("X inicial do poligono : ");
    scanf("%d", &P1.Xini);
	printf("Y inicial do poligono : ");
   	scanf("%d", &P1.Yini);
   	P1.QuantidadeDeRetas = 0;
    printar(&P1);
    while (P1.Xini != P1.Xnovo && P1.Yini != P1.Ynovo){
        printf("\nX novo do poligono : ");
		scanf("%d", &P1.Xnovo);
        printf("\nY novo do poligono : ");
        scanf("%d", &P1.Ynovo);
        printar(&P1);
    }
}
