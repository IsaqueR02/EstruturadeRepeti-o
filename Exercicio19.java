class Main
{
  public static void main (String[]args)
  {
    /*Suponha que uma bola de massa qualquer seja arremessada para cima numa velocidade v0. Qual é a velocidade v(t) e sua altura acima do lançamento h(t) no instante t? A resposta, se desprezamos a resistência do ar e um conjunto de outras pequenas influências, é:
O que acontecerá com a velocidade e altura da bola no intervalo de tempo de 0 a 2 segundos? Mostre o comportamento a cada 0,1 segundos. Desenvolva um programa em Java que mostre o resultado da velocidade e da altura da bola para cada iteração. Exemplo: */ 
    double vt, v0 = 0, h = 0, m = 0;;
    for (double t = 0; t <=2; t+=0.1){
      v0 = 15;
      m = 9.8;
      h = v0*t - ((m*Math.pow(t,2))/2);
      vt = v0 - m*t;
      System.out.printf("%.2f ",t);
      System.out.printf("%.2f ",h);
      System.out.printf("%.2f \n",vt);
    }
  }
}
