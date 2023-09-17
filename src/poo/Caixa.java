package poo;

import java.util.Scanner;

    public class Caixa {
        public static void main(String[] args) {
            // Criar objetos Produto
            Produto produto1 = new Produto(1, "Camiseta", 19.99);
            Produto produto2 = new Produto(2, "Calça Jeans", 49.99);
            Produto produto3 = new Produto(3, "Tênis", 79.99);

            // Exibir lista de produtos
            System.out.println("Lista de Produtos Disponíveis:");
            System.out.println("1. " + produto1.nome());
            System.out.println("2. " + produto2.nome());
            System.out.println("3. " + produto3.nome());

            // Inicializar variáveis para quantidade e valor total
            int quantidadeTotal = 0;
            double valorTotal = 0.0;

            // Pedir ao usuário que escolha um produto e a quantidade
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Escolha um produto (1, 2 ou 3) ou digite 0 para finalizar: ");
                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    break; // Encerra o loop quando o usuário escolhe 0
                } else if (escolha < 1 || escolha > 3) {
                    System.out.println("Escolha inválida. Tente novamente.");
                    continue; // Volta ao início do loop para uma escolha inválida
                }

                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();

                // Atualizar a quantidade total e o valor total
                Produto produtoEscolhido = switch (escolha) {
                    case 1 -> produto1;
                    case 2 -> produto2;
                    case 3 -> produto3;
                    default -> null;
                };

                quantidadeTotal += quantidade;
                valorTotal += produtoEscolhido.preco() * quantidade;
            }

            // Exibir o resumo da compra
            System.out.println("Resumo da Compra:");
            System.out.println("Quantidade Total de Produtos: " + quantidadeTotal);
            System.out.println("Valor Total: R$ " + valorTotal);

            // Fechar o scanner
            scanner.close();
        }
    }

