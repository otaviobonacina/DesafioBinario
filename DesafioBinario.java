public class DesafioBinario{
    public static void main(String[]args){
        int idade =20;
        int vetor[]=new int[15];
        int contador=0;
         while(idade>=2){

          vetor[contador]=idade%2;
          contador++;
          idade=idade/2;

      }
      vetor[contador]=idade;
    for(int indice=contador;indice>=0; indice--){
        System.out.print(vetor[indice]);
    }
}}