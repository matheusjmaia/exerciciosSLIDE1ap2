
package exes;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXE {

    static boolean verificaImparPar (int numero){
        if (!(numero%2 == 0)){
            return false;
        } else {
            return true;
        }
    }
    static int numero (){
        System.out.print("Digite um número: ");
        Scanner console = new Scanner (System.in);
        int numero = console.nextInt();
        return numero;
    }
    public static void main(String[] args) {
      int numero = numero();
      boolean condicao = verificaImparPar(numero);
      if (condicao == true){
          System.out.println("Esse número é par!");
      }else {
          System.out.println("Esse número é impar!");
      } 
          
              
                   
      
        
    }
    
}
