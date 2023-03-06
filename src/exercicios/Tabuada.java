package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para exibir a tabuada: ");
        int numero = sc.nextInt();
        System.out.printf("Tabuada do %d:\n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}