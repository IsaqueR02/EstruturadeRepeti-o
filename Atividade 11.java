import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner potencia = new Scanner(System.in);
        int num, pot = 0;
        
            System.out.println("Digite um numero");
            num = potencia.nextInt();
      
            
            for(int i = 0;i <= num; i++){
                pot = i * i;
            }
            
            System.out.println("A potencia do numero " + num + " é: " + pot);
            
    }

  }
