//Main do código, utilizando tanto a struct Poligono quanto o Print//
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
