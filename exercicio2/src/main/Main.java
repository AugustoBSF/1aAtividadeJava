package main;
import funcionarioLeitura.MetodoFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        MetodoFuncionario funcionario = new MetodoFuncionario();
        MetodoFuncionario mf1 = new MetodoFuncionario();
        System.out.print("Informe seu nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Informe o Salário Bruto: R$");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Informe o imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println("Funcionário: "+  funcionario);
        System.out.print("Qual o percentual de aumento? ");
        double percentual = sc.nextDouble ();
        funcionario.aumentarSalario( percentual);
        System.out.println("Dados Atualizados: " + funcionario);
    }
        }


