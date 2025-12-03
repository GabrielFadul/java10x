package javaIntermediario.abstracao;

public abstract class Ninja implements EstrategiaDeBatalhaNinja {
    String nome;
    int idade;
    String aldeia;
    int missoesConcluidas;
    NivelNinja rank;
    String clan;
    public final double altura = 2.10;

    // Construtor vazio
    public Ninja(){
    }

    // Overload de construtores
    public Ninja(String nome){
        this.clan = this.getClass().getSimpleName(); //Pega o nome da Class e atribui ao atributo clan
        this.nome = nome + " " + clan;
    }

    public Ninja(String nome, int idade, String aldeia) {
        this(nome);
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja(String nome, int idade, String aldeia, int missoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia); // Overload de contrutor, esse This, referencia o construtor com os mesmos parametros
        this.missoesConcluidas = missoesConcluidas;
        this.rank = rank;
    }

    public abstract void habilidadeEspecial();

    // TODO: Ataque que todo ninja vai fazer
    final public void tacarKunai() {
        System.out.println("Taquei uma kunai");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Clan: " + clan);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Missões Concluídas: " + missoesConcluidas);
        System.out.println("Nível do Ninja: " + rank);
    }

    // Quando declarado na classe mãe não precisa refazer nas
    // classes filhas
    @Override
    public void estrategiaDeCombate() {
        System.out.println("Essa é minha estrategia de combate");
    }

    // Inteligencia Ninja - Padrão
    @Override
    public void inteligenciaNinja() {
        System.out.println("Nível básico de inteligencia");
    }

    // Inteligencia Ninja - Sobrecarga
    @Override
    public void inteligenciaNinja(int qi) {
        String nivelDeInteligencia;
        if (qi > 0 && qi < 80) {
            nivelDeInteligencia = "básico";
        } else if (qi > 80 && qi < 100) {
            nivelDeInteligencia = "médio";
        } else {
            nivelDeInteligencia = "alto";
        }

        System.out.println("Nível " + nivelDeInteligencia + " de inteligencia");
    }

    @Override
    public String toString() {
        return nome
                + "\n- Clan: " + clan
                + "\n- Idade: " + idade
                + "\n- Aldeia: " + aldeia
                + "\n- Missões Concluídas: " + missoesConcluidas
                + "\n- Rank: " + rank;
    }
}
