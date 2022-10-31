class Main
{
  public static void main (String[]args)
  {
    double T, tempo = 0, media, maior = 0, menor = Double.MAX_VALUE, h1 = 0, h2 = 0, acumulador = 0;

    for (tempo = 0; tempo < 10; tempo++)
      {
	T =	  (19.06 + 0.211 * Math.cos (0.08721 * tempo)) + (- 5.51 * Math.sin (0.08721 * tempo));
        
        System.out.println(T);
        acumulador = acumulador + T;
        if(T > maior){
          maior = T;
        }
        if(T < menor){
        menor = T;
          }
        if(T > 19.0){
          h1 = h1 + 1;
        }
        if(T < 16.0){
          h2 = h2 + 1;
        }
      }
	    media = acumulador / 48;

    
  System.out.println ("1- A temperatura media do  "+ media);
  System.out.println ("2- A maior temperatura registrada no periodo "+ maior);
  System.out.println ("3- A menor temperatura registrada no periodo "+ menor);
  System.out.println ("4- Quantas horas a temperatura ficou acima de 19C. "+ h1);
  System.out.println ("5- Quantas horas a temperatura ficou abaixo de 16C. "+ h2);
  }
}
