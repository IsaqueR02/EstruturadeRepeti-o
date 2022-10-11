import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int maior, menor, plus, i;
    maior = Integer.MIN_VALUE;
    menor = Integer.MAX_VALUE;
    for (i = 0;i < 10; i++){
      System.out.println("Imprima um numero "+(i+1));
      plus = input.nextInt();
      if(plus > maior){
        maior = plus;
        
      }if(plus < menor){
        menor = plus;
        
      }
    }
    System.out.println("Imprima o maior numero "+ maior);
    System.out.println("Imprima o menor numero "+ menor);
    }
}
