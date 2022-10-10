import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int sexo, peso, h1 = 0, m2 = 0;
      
     for(int imc = 0; imc <= 10; imc++){
       System.out.println("Selecione seu sexo:");
       System.out.println("1- Homem ");
       System.out.println("2- Mulher ");
       sexo = ler.nextInt();
       System.out.println("Imprima o peso: ");
       peso = ler.nextInt();
       
       switch(sexo){
         case 1:
           if(peso >= 60 & peso <=80){
             h1 = h1 + 1;
           }
           break;
         case 2:
           if(peso >= 50 & peso <=70){
             m2 = m2 + 1;
           }
           break;
       }
       
     }
    System.out.println("A quantidade de homens com o peso definido é: "+ h1);
    System.out.println("A quantidade de mulheres com o peso definido é: "+ m2);
  }
}
