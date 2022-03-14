import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Desafio{
    public static void main(String[] args){
        int idade;
        List<Integer> binarios = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade em decimal: ");
        idade = input.nextInt();
 
        while(idade > 0){
            int mod = idade%2;
            binarios.add(mod);
            idade = idade/2;
        }
        Collections.reverse(binarios);
        for(int indice: binarios){
            System.out.print(indice);
        }
        System.out.println("");
 
    }}}