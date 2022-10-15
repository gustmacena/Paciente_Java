import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente p = new Paciente();
        Paciente p2 = new Paciente("");
        Scanner leia = new Scanner (System.in);

        System.out.println("Bem Vindo ao MEU consultório \nVamos iniciar o cadastro.");
        System.out.print("Nome: ");
        p.nome = leia.nextLine();

        System.out.print("RG: ");
        p.rg = leia.nextLine();

        System.out.print("Endereço: ");
        p.end = leia.nextLine();

        System.out.print("Telefone: ");
        p.tel = leia.nextLine();

        System.out.print("Ano de Nascimento: ");
        p.nasc = leia.nextInt();

        System.out.print("Ano Atual: ");
        int anoAtual = leia.nextInt();

        leia.nextLine();

        System.out.print("Profissão: ");
        p.prof = leia.nextLine();


        p.imprimeDados();

        System.out.println("A idade do paciente é: " +p.calculaIdade(anoAtual)); 

       

        

        leia.close();


    }
}
