package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño;
        int a[];
        System.out.println("PERMUTACIONES:\n");
        System.out.println("¿Cuantos numeros desea Permutar?:\n");
        tamaño = teclado.nextInt();
        a=new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            a[i] = teclado.nextInt();
        }
        System.out.println("Longitud del arreglo: " + a.length);
    }
}
