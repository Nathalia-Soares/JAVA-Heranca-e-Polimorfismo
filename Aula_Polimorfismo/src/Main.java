import model.Transporte;

import model.Automovel;
import model.Navio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Transporte[] conjuntoTransporte = new Transporte[10];

        Scanner input = new Scanner(System.in);

        System.out.println(" +++ CADASTRO DE VEÍCULOS +++ ");
        System.out.println("Quantos veículos você quer cadastrar?");
        int opcao = input.nextInt();

        while(opcao != 0) {
            System.out.println(" +++ CADASTRO DE VEÍCULOS +++ ");
            System.out.println("Você quer cadastrar qual veículo?");
            System.out.println("Digite 1 para automóvel, 2 para navio");
            int opcaoVeiculo = input.nextInt();
            switch (opcaoVeiculo) {
                case 1:
                    System.out.println("Qual é a capacidade de pessoas do veículo? ");
                    int capacidadePessoas = input.nextInt();
                    System.out.println("Quantas rodas têm o veículo? ");
                    int numRodas = input.nextInt();
                    System.out.println("Qual é a cor do veículo? ");
                    String cor = input.next();
                    System.out.println("Quantas portas têm o veículo? ");
                    int numPortas = input.nextInt();
                    System.out.println("Qual é a placa do veículo? ");
                    String placa = input.next();


                    for (int i = 0; i < conjuntoTransporte.length; i++) {
                        if (conjuntoTransporte[i] == null) {
                            conjuntoTransporte[i] = new Automovel(capacidadePessoas, numRodas, cor, numPortas, placa);
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Qual é a capacidade de pessoas do veículo? ");
                    int capacidadePessoas2 = input.nextInt();
                    System.out.println("Qual é o porte bruto do veículo? ");
                    int porteBruto = input.nextInt();
                    System.out.println("Qual é o porte líquido do veículo? ");
                    int porteLiquido = input.nextInt();


                    for (int i = 0; i < conjuntoTransporte.length; i++) {
                        if (conjuntoTransporte[i] == null) {
                            conjuntoTransporte[i] = new Navio(capacidadePessoas2, porteBruto, porteLiquido);
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("+++ Fim do Programa +++");
                    break;
            }
            opcao--;
        }


        for (int i = 0; i < conjuntoTransporte.length; i++) {
            if (conjuntoTransporte[i] != null) {
                System.out.println("\nOs dados do " + conjuntoTransporte[i].getClass().getSimpleName() + " #" + i + 1 + " são: ");
                System.out.println(conjuntoTransporte[i].mostrarDados());
            }
        }
        input.close();
    }
}

