import java.util.*;
class Main {
  public static void main(String[] args) {
    
     Scanner nota = new Scanner(System.in);
        int nota1, nota2, notafinal1, notafinal2;
        int media, i, contAluno = 0;
    notafinal1 = Integer.MAX_VAlUE;
    notafinal2 = Integer.MIN_Value;
        
        for(i = 0; i < 5; i++){
            
            contAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = nota.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = nota.nextInt();
            
    
    if(media > notafinal1){
        notafinal1 = media;
        
      }else(media < notafinal2){
        notafinal2 = media;
         
        }
        }
        System.out.println("O aluno "+ contAluno + " tem a maior nota " + notafinal2);
    System.out.println("O aluno "+ contAluno + " tem a menor nota " + notafinal1);
  }
}
