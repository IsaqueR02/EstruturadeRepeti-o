import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner analise = new Scanner(System.in);
    int idade, femin;
        femin = Integer.MIN_VALUE;
    for (int x=1;x<=5;x++){
      
        System.out.println("Imprima sua idade: ");
      idade = analise.nextInt();
    if(idade >= 20 & idade <= 40){
       femin = x;
}
    }
    System.out.println("A quantidade de mulheres entre 20 e 40 é " + femin);
  }
