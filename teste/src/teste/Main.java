package teste;


import xadrez.Bispo;
import xadrez.Cavalo;
import xadrez.Peao;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Bem vindo ao Xadrez!");

        Peao  p1 = new Peao();
        Bispo b1 = new Bispo();
        Cavalo  c1 = new Cavalo();

        p1.mover();
        b1.mover();
        c1.mover();
    }
}