import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner fator = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;

    do{
            System.out.println("Digite um numero");
            num = fator.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
              System.out.println(fat);
            }
            
            System.out.println("!" + num + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }

  }
