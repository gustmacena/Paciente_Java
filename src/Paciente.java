public class Paciente {
    String nome;
    String rg;
    String tel;
    String end;
    String prof;
    int nasc;

    public Paciente() {

    }

    public Paciente(String nome) {
        this.nome = nome;
    }

    void cadastrarDados() {

    }

    void imprimeDados() {
        System.out.println("Bem Vindo! Vamos realizar o seu cadastro");
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + tel);
        System.out.println("Endereço: " + end);
        System.out.println("Profissão: " + prof);

    }

    int calculaIdade(int anoAtual) {
        int idade = anoAtual - nasc;
        return idade;
    }

}
