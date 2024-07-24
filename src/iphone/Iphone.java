package iphone;

import funcionalidades.IphoneFuncoes;

public class Iphone {
    public static void main(String[] args) {

        IphoneFuncoes smartphone = new IphoneFuncoes();

        System.out.println("REPRODUTOR MÚSICAL");
        smartphone.tocar();
        smartphone.pausar();
        smartphone.selecionarMusica("Teste");

        System.out.println("----------------");

        System.out.println("APARELHO TELEFÔNICO");
        smartphone.ligar("89391819");
        smartphone.atender();
        smartphone.iniciarCorreioVoz();

        System.out.println("----------------");

        System.out.println("NAVEGADOR DE INTERNET");
        smartphone.exibirPagina("www.google.com");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
    }
}
