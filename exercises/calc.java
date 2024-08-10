import java.util.Scanner;


public class calc {
    public static void main(String[] args) throws Exception {
   int sexo,qtMasc=0,qtFem=0;
   float altura, somaH=0, mediaMasc=0,maior=0, menor=0;

   Scanner entrada = new Scanner(System.in);

   for (int i=0;i<10;i++){
    System.out.println("Digite o Sexo da Pessoa (1-Mulher, 2-Homem): ");
    sexo = entrada.nextInt();
    System.out.println("Digite a Altura: ");
    altura = entrada.nextFloat();
    if (sexo == 1){
        qtFem++;
    } else if (sexo == 2){
        qtMasc++;
        somaH = somaH + altura;
    } else {
        System.out.println("Opção sexo inválida!");
    }
    if (altura > maior) {
        maior = altura;
    } else if (menor > altura){
        menor = altura;
    }
   }
   mediaMasc = somaH/qtMasc;

   System.out.println("A maior altura do Grupo é de: " + maior);
   System.out.println("A menor altura do Grupo é de: " + menor);
   System.out.println("A altura media dos homens é de: " + mediaMasc);
   System.out.println("O numero de mulheres é de: " + qtFem);
   entrada.close();
}
}