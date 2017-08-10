package exes;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXE2 {

    static Scanner console = new Scanner(System.in);

    static int pedirnumero() {
        int n = 0;
        while (n <= 0) {
            System.out.print("Insira um número positivo e maior que zero: ");
            n = console.nextInt();
        }
        return n;
    }

    static int somatoria(int n, int m) {
        int soma = 0;
        if (n < m) {
            for (int i = n; n < m; n++) {
                soma = soma + n;
            }

        } else {
            for (int i = m; m < n; m++) {
                soma = soma + m;
            }

        }
        return soma;
    }

    public static void main(String[] args) {
        int n = pedirnumero();
        int m = pedirnumero();
        int soma = somatoria(n, m);
        if (n < m){
        System.out.println("A somatoria dos números entre "+n+" e "+m+" é: "+soma);
        }else{
            System.out.println("A somatoria dos números entre "+m+" e "+n+" é: "+soma);
        }
    }

}
