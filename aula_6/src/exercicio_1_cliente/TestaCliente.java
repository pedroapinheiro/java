package exercicio_1_cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Cliente> clienteList = new ArrayList<>();

        String cpf,cnpj,resposta;
        do {
            System.out.println("Nome: ");
            sc.skip("\\R?");
            String nome = sc.nextLine();

            System.out.println("Telefone: ");
            sc.skip("\\R?");
            String telefone = sc.nextLine();

            System.out.println("Idade: ");
            sc.skip("\\R?");
            Integer idade = sc.nextInt();

            System.out.println("Email: ");
            sc.skip("\\R?");
            String email = sc.nextLine();

            System.out.println("Endereço: ");
            sc.skip("\\R?");
            String endereco = sc.nextLine();

            System.out.println("Tipo: ");
            int tipo = sc.nextInt();

            switch (tipo){
                case 1 ->{
                    System.out.println("CPF: ");
                    sc.skip("\\R?");
                    cpf = sc.nextLine();
                    clienteList.add(new Pf (nome, telefone, idade, email, endereco, tipo));
                }
                case 2 ->{
                    System.out.println("CNPJ: ");
                    sc.skip("\\R?");
                    cnpj = sc.nextLine();
                    clienteList.add(new Pj (nome, telefone, idade, email, endereco, tipo));
                }
            }

            System.out.println("Deseja digitar mais um cliente: ");
            sc.skip("\\R?");
            resposta = sc.nextLine();

        }while (resposta.equalsIgnoreCase("s"));

        for (Cliente cliente : clienteList) {
            cliente.visualizar();
        }
    }
}