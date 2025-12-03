package javaIntermediario.desafio4;

public class Main {
    static void main() {
        Ninja ninjaBasico = new NinjaBasico(
                "Ninja Basico 1",
                34,
                TipoHabilidade.TAIJUTSU
        );

        Ninja ninjaAvancado = new NinjaAvancado(
                "Ninja Avançado 1",
                34,
                TipoHabilidade.NINJUTSU,
                "Fogo"
        );

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}

