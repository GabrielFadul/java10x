package javaIntermediario.desafio3;

import javaIntermediario.heranca.Ninja;

public class Desafio3 {
    static void main() {

    String[] opcoesMenu = {
            "Cadastrar ninja",
            "Adicionar/Atualizar habilidade especial",
            "Mostrar informações de todos os ninjas",
            "Sair"
    };

    GerenciadorDeNinjas gerenciadorDeNinjas = new GerenciadorDeNinjas();

    int opcaoSelecionada = 0;

        while (opcaoSelecionada != 4) {
        opcaoSelecionada = gerenciadorDeNinjas.obterNumeroNoMenu(opcoesMenu, "Gerenciador de Ninjas");

        switch (opcaoSelecionada) {
            case 1:
                gerenciadorDeNinjas.cadastrarNinja();
                break;
            case 2:
                Ninja ninja = gerenciadorDeNinjas.obterNinjaNoMenu("Lista de Ninjas");
                gerenciadorDeNinjas.atualizarHabilidadeEspecialNinja(ninja);
                break;
            case 3:
                gerenciadorDeNinjas.exibirInformacoesTodosNinjas();
                break;
            case 4:
                gerenciadorDeNinjas.sair();
                break;
            default:
                System.out.println("Opção invalida");
        }
    }

        System.out.println("Programa finalizado");
}
}

