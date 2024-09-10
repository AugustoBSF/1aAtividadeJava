package main;

import notas.notas;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        notas a = new notas();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu nome: ");
        a.nome = sc.nextLine();

        do {
            System.out.println("Digite sua nota do 1° Trimestre: ");
            a.Pt = sc.nextDouble();
        } while (a.Pt < 0 || a.Pt > 30);

        do {
            System.out.println("Digite sua nota do 2° Trimestre: ");
            a.St = sc.nextDouble();
        } while (a.St < 0 || a.St > 35);

        do {
            System.out.println("Digite sua nota do 3° Trimestre: ");
            a.Tt = sc.nextDouble();
        } while (a.Tt < 0 || a.Tt > 35);


        a.media();
        if (a.Media >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }
    }
}
