package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> pizzas = new ArrayList<String>();
        ArrayList<String> ingredientes = new ArrayList<String>();
        ArrayList<String> adicionais = new ArrayList<String>();
        ArrayList<String> bordas = new ArrayList<String>();

        ArrayList<Double> precosPizzas = new ArrayList<Double>();
        ArrayList<Double> precosAdicionais = new ArrayList<Double>();
        ArrayList<Double> precosBordas = new ArrayList<Double>();

        ArrayList<String> bebidas = new ArrayList<String>();
        ArrayList<Double> precosBebidas = new ArrayList<Double>();

        double subtotalPizzas = 0;
        double subtotalAdicionais = 0;
        double subtotalBordas = 0;
        double subtotalBebidas = 0;

        // ==============================
        // CABECALHO
        // ==============================

        System.out.println("==============================");
        System.out.println("       PIZZARIA MIGUEL");
        System.out.println("==============================");
        System.out.println("Bem-vindo!");
        System.out.println();

        // ==============================
        // DADOS DO CLIENTE
        // ==============================

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = entrada.nextLine();

        System.out.println();

        // ==============================
        // QUANTIDADE DE PIZZAS
        // ==============================

        System.out.print("Quantas pizzas deseja pedir? (1 a 10): ");
        int quantidadePizzas = entrada.nextInt();

        while (quantidadePizzas < 1 || quantidadePizzas > 10) {
            System.out.print("Digite uma quantidade entre 1 e 10: ");
            quantidadePizzas = entrada.nextInt();
        }

        // ==============================
        // CARDAPIO DE PIZZAS
        // ==============================

        System.out.println();
        System.out.println("======================================");
        System.out.println("           CARDAPIO DE PIZZAS");
        System.out.println("======================================");

        System.out.println();
        System.out.println("PIZZAS SALGADAS");
        System.out.println();

        System.out.println("1 - Calabresa - R$ 35,00");
        System.out.println("    Ingredientes: calabresa, cebola e queijo");

        System.out.println("2 - Frango - R$ 38,00");
        System.out.println("    Ingredientes: frango e queijo");

        System.out.println("3 - Mussarela - R$ 32,00");
        System.out.println("    Ingredientes: mussarela e oregano");

        System.out.println("4 - Portuguesa - R$ 40,00");
        System.out.println("    Ingredientes: presunto, ovo, cebola, ervilha e queijo");

        System.out.println("5 - Marguerita - R$ 37,00");
        System.out.println("    Ingredientes: mussarela, tomate e manjericao");

        System.out.println("6 - 4 Queijos - R$ 42,00");
        System.out.println("    Ingredientes: mussarela, provolone, parmesao e catupiry");

        System.out.println("7 - Pepperoni - R$ 45,00");
        System.out.println("    Ingredientes: pepperoni e queijo");

        System.out.println("8 - Frango Catupiry - R$ 42,00");
        System.out.println("    Ingredientes: frango e catupiry");

        System.out.println("9 - Bacon - R$ 40,00");
        System.out.println("    Ingredientes: bacon e queijo");

        System.out.println("10 - Vegetariana - R$ 38,00");
        System.out.println("     Ingredientes: tomate, milho, cebola, azeitona e queijo");

        System.out.println();
        System.out.println("PIZZAS DOCES");
        System.out.println();

        System.out.println("11 - Banana - R$ 35,00");
        System.out.println("     Ingredientes: banana, acucar e canela");

        System.out.println("12 - Banana com Chocolate - R$ 38,00");
        System.out.println("     Ingredientes: banana, chocolate, acucar e canela");

        System.out.println("13 - Morango com Nutella - R$ 45,00");
        System.out.println("     Ingredientes: morango e Nutella");

        System.out.println("14 - Churros - R$ 40,00");
        System.out.println("     Ingredientes: doce de leite, acucar e canela");

        // ==============================
        // ESCOLHA DAS PIZZAS
        // ==============================

        for (int i = 0; i < quantidadePizzas; i++) {

            System.out.println();
            System.out.println("======================================");
            System.out.println("ESCOLHA DA PIZZA " + (i + 1));
            System.out.println("======================================");

            System.out.print("Digite o numero da pizza: ");
            int opcaoPizza = entrada.nextInt();

            while (opcaoPizza < 1 || opcaoPizza > 14) {
                System.out.print("Opcao invalida. Digite de 1 a 14: ");
                opcaoPizza = entrada.nextInt();
            }

            String nomePizza = "";
            String ingredientePizza = "";
            double precoPizza = 0;

            if (opcaoPizza == 1) {
                nomePizza = "Calabresa";
                ingredientePizza = "calabresa, cebola e queijo";
                precoPizza = 35;

            } else if (opcaoPizza == 2) {
                nomePizza = "Frango";
                ingredientePizza = "frango e queijo";
                precoPizza = 38;

            } else if (opcaoPizza == 3) {
                nomePizza = "Mussarela";
                ingredientePizza = "mussarela e oregano";
                precoPizza = 32;

            } else if (opcaoPizza == 4) {
                nomePizza = "Portuguesa";
                ingredientePizza = "presunto, ovo, cebola, ervilha e queijo";
                precoPizza = 40;

            } else if (opcaoPizza == 5) {
                nomePizza = "Marguerita";
                ingredientePizza = "mussarela, tomate e manjericao";
                precoPizza = 37;

            } else if (opcaoPizza == 6) {
                nomePizza = "4 Queijos";
                ingredientePizza = "mussarela, provolone, parmesao e catupiry";
                precoPizza = 42;

            } else if (opcaoPizza == 7) {
                nomePizza = "Pepperoni";
                ingredientePizza = "pepperoni e queijo";
                precoPizza = 45;

            } else if (opcaoPizza == 8) {
                nomePizza = "Frango Catupiry";
                ingredientePizza = "frango e catupiry";
                precoPizza = 42;

            } else if (opcaoPizza == 9) {
                nomePizza = "Bacon";
                ingredientePizza = "bacon e queijo";
                precoPizza = 40;

            } else if (opcaoPizza == 10) {
                nomePizza = "Vegetariana";
                ingredientePizza = "tomate, milho, cebola, azeitona e queijo";
                precoPizza = 38;

            } else if (opcaoPizza == 11) {
                nomePizza = "Banana";
                ingredientePizza = "banana, acucar e canela";
                precoPizza = 35;

            } else if (opcaoPizza == 12) {
                nomePizza = "Banana com Chocolate";
                ingredientePizza = "banana, chocolate, acucar e canela";
                precoPizza = 38;

            } else if (opcaoPizza == 13) {
                nomePizza = "Morango com Nutella";
                ingredientePizza = "morango e Nutella";
                precoPizza = 45;

            } else if (opcaoPizza == 14) {
                nomePizza = "Churros";
                ingredientePizza = "doce de leite, acucar e canela";
                precoPizza = 40;
            }

            pizzas.add(nomePizza);
            ingredientes.add(ingredientePizza);
            precosPizzas.add(precoPizza);

            subtotalPizzas += precoPizza;

            // ==============================
            // BORDAS
            // ==============================

            System.out.println();
            System.out.println("BORDAS DISPONIVEIS:");
            System.out.println("1 - Sem borda - R$ 0,00");
            System.out.println("2 - Catupiry - R$ 8,00");
            System.out.println("3 - Cheddar - R$ 8,00");
            System.out.println("4 - Cream Cheese - R$ 9,00");
            System.out.println("5 - Doce de Leite - R$ 8,00");
            System.out.println("6 - Chocolate ao Leite - R$ 9,00");
            System.out.println("7 - Nutella - R$ 12,00");
            System.out.println("8 - Ninho - R$ 10,00");

            System.out.print("Escolha a borda: ");
            int opcaoBorda = entrada.nextInt();

            while (opcaoBorda < 1 || opcaoBorda > 8) {
                System.out.print("Opcao invalida. Escolha de 1 a 8: ");
                opcaoBorda = entrada.nextInt();
            }

            String nomeBorda = "";
            double precoBorda = 0;

            if (opcaoBorda == 1) {
                nomeBorda = "Sem borda";
                precoBorda = 0;

            } else if (opcaoBorda == 2) {
                nomeBorda = "Catupiry";
                precoBorda = 8;

            } else if (opcaoBorda == 3) {
                nomeBorda = "Cheddar";
                precoBorda = 8;

            } else if (opcaoBorda == 4) {
                nomeBorda = "Cream Cheese";
                precoBorda = 9;

            } else if (opcaoBorda == 5) {
                nomeBorda = "Doce de Leite";
                precoBorda = 8;

            } else if (opcaoBorda == 6) {
                nomeBorda = "Chocolate ao Leite";
                precoBorda = 9;

            } else if (opcaoBorda == 7) {
                nomeBorda = "Nutella";
                precoBorda = 12;

            } else if (opcaoBorda == 8) {
                nomeBorda = "Ninho";
                precoBorda = 10;
            }

            bordas.add(nomeBorda);
            precosBordas.add(precoBorda);

            subtotalBordas += precoBorda;

            // ==============================
            // ADICIONAIS
            // ==============================

            ArrayList<String> adicionaisPizza = new ArrayList<String>();
            double valorAdicionaisPizza = 0;

            if (opcaoPizza <= 10) {

                int adicionarMais = 1;

                while (adicionarMais == 1) {

                    System.out.println();
                    System.out.println("ADICIONAIS:");
                    System.out.println("1 - Nenhum adicional - R$ 0,00");
                    System.out.println("2 - Bacon - R$ 5,00");
                    System.out.println("3 - Milho - R$ 3,00");
                    System.out.println("4 - Azeitona - R$ 3,00");
                    System.out.println("5 - Tomate - R$ 3,00");
                    System.out.println("6 - Cebola - R$ 2,00");
                    System.out.println("7 - Alho Granulado - R$ 2,00");
                    System.out.println("8 - Palmito - R$ 5,00");

                    System.out.print("Escolha um adicional: ");
                    int opcaoAdicional = entrada.nextInt();

                    while (opcaoAdicional < 1 || opcaoAdicional > 8) {
                        System.out.print("Opcao invalida. Escolha de 1 a 8: ");
                        opcaoAdicional = entrada.nextInt();
                    }

                    String nomeAdicional = "";
                    double precoAdicional = 0;

                    if (opcaoAdicional == 1) {
                        nomeAdicional = "Nenhum adicional";

                    } else if (opcaoAdicional == 2) {
                        nomeAdicional = "Bacon";
                        precoAdicional = 5;

                    } else if (opcaoAdicional == 3) {
                        nomeAdicional = "Milho";
                        precoAdicional = 3;

                    } else if (opcaoAdicional == 4) {
                        nomeAdicional = "Azeitona";
                        precoAdicional = 3;

                    } else if (opcaoAdicional == 5) {
                        nomeAdicional = "Tomate";
                        precoAdicional = 3;

                    } else if (opcaoAdicional == 6) {
                        nomeAdicional = "Cebola";
                        precoAdicional = 2;

                    } else if (opcaoAdicional == 7) {
                        nomeAdicional = "Alho Granulado";
                        precoAdicional = 2;

                    } else if (opcaoAdicional == 8) {
                        nomeAdicional = "Palmito";
                        precoAdicional = 5;
                    }

                    if (opcaoAdicional != 1) {

                        adicionaisPizza.add(nomeAdicional);
                        valorAdicionaisPizza += precoAdicional;

                        System.out.print(
                                "Deseja adicionar outro adicional? 1 - Sim / 2 - Nao: "
                        );

                        adicionarMais = entrada.nextInt();

                        while (adicionarMais != 1 && adicionarMais != 2) {
                            System.out.print(
                                    "Opcao invalida. Digite 1 para Sim ou 2 para Nao: "
                            );
                            adicionarMais = entrada.nextInt();
                        }

                    } else {
                        adicionarMais = 2;
                    }
                }

                if (adicionaisPizza.size() == 0) {
                    adicionais.add("Nenhum adicional");

                } else {

                    String textoAdicionais = "";

                    for (int j = 0; j < adicionaisPizza.size(); j++) {

                        if (j > 0) {
                            textoAdicionais += ", ";
                        }

                        textoAdicionais += adicionaisPizza.get(j);
                    }

                    adicionais.add(textoAdicionais);
                }

                precosAdicionais.add(valorAdicionaisPizza);
                subtotalAdicionais += valorAdicionaisPizza;

            } else {

                adicionais.add("Nao se aplica");
                precosAdicionais.add(0.0);
            }
        }

        // ==============================
        // BEBIDAS
        // ==============================

        System.out.println();
        System.out.println("======================================");
        System.out.println("               BEBIDAS");
        System.out.println("======================================");

        System.out.print("Deseja adicionar bebida? 1 - Sim / 2 - Nao: ");

        int desejaBebida = entrada.nextInt();

        while (desejaBebida != 1 && desejaBebida != 2) {
            System.out.print("Opcao invalida. Digite 1 para Sim ou 2 para Nao: ");
            desejaBebida = entrada.nextInt();
        }

        if (desejaBebida == 1) {

            System.out.print("Quantas bebidas deseja? (1 a 8): ");
            int quantidadeBebidas = entrada.nextInt();

            while (quantidadeBebidas < 1 || quantidadeBebidas > 8) {
                System.out.print("Digite uma quantidade entre 1 e 8: ");
                quantidadeBebidas = entrada.nextInt();
            }

            System.out.println();
            System.out.println("======================================");
            System.out.println("          CARDAPIO DE BEBIDAS");
            System.out.println("======================================");

            System.out.println("1 - Coca-Cola 2L - R$ 12,00");
            System.out.println("2 - Coca-Cola 600ml - R$ 8,00");
            System.out.println("3 - Coca-Cola Lata - R$ 6,00");
            System.out.println("4 - Coca-Cola Zero 2L - R$ 12,00");
            System.out.println("5 - Coca-Cola Zero 600ml - R$ 8,00");
            System.out.println("6 - Coca-Cola Zero Lata - R$ 6,00");
            System.out.println("7 - Fanta Laranja 2L - R$ 10,00");
            System.out.println("8 - Fanta Laranja 600ml - R$ 7,00");
            System.out.println("9 - Fanta Laranja Lata - R$ 6,00");
            System.out.println("10 - Fanta Guarana 2L - R$ 10,00");
            System.out.println("11 - Fanta Guarana 600ml - R$ 7,00");
            System.out.println("12 - Fanta Guarana Lata - R$ 6,00");
            System.out.println("13 - Agua - R$ 4,00");

            for (int i = 0; i < quantidadeBebidas; i++) {

                System.out.println();
                System.out.print("Escolha a bebida " + (i + 1) + ": ");

                int opcaoBebida = entrada.nextInt();

                while (opcaoBebida < 1 || opcaoBebida > 13) {
                    System.out.print("Opcao invalida. Escolha de 1 a 13: ");
                    opcaoBebida = entrada.nextInt();
                }

                String nomeBebida = "";
                double precoBebida = 0;

                if (opcaoBebida == 1) {
                    nomeBebida = "Coca-Cola 2L";
                    precoBebida = 12;

                } else if (opcaoBebida == 2) {
                    nomeBebida = "Coca-Cola 600ml";
                    precoBebida = 8;

                } else if (opcaoBebida == 3) {
                    nomeBebida = "Coca-Cola Lata";
                    precoBebida = 6;

                } else if (opcaoBebida == 4) {
                    nomeBebida = "Coca-Cola Zero 2L";
                    precoBebida = 12;

                } else if (opcaoBebida == 5) {
                    nomeBebida = "Coca-Cola Zero 600ml";
                    precoBebida = 8;

                } else if (opcaoBebida == 6) {
                    nomeBebida = "Coca-Cola Zero Lata";
                    precoBebida = 6;

                } else if (opcaoBebida == 7) {
                    nomeBebida = "Fanta Laranja 2L";
                    precoBebida = 10;

                } else if (opcaoBebida == 8) {
                    nomeBebida = "Fanta Laranja 600ml";
                    precoBebida = 7;

                } else if (opcaoBebida == 9) {
                    nomeBebida = "Fanta Laranja Lata";
                    precoBebida = 6;

                } else if (opcaoBebida == 10) {
                    nomeBebida = "Fanta Guarana 2L";
                    precoBebida = 10;

                } else if (opcaoBebida == 11) {
                    nomeBebida = "Fanta Guarana 600ml";
                    precoBebida = 7;

                } else if (opcaoBebida == 12) {
                    nomeBebida = "Fanta Guarana Lata";
                    precoBebida = 6;

                } else if (opcaoBebida == 13) {
                    nomeBebida = "Agua";
                    precoBebida = 4;
                }

                bebidas.add(nomeBebida);
                precosBebidas.add(precoBebida);
                subtotalBebidas += precoBebida;
            }
        }

        // ==============================
        // ENDERECO
        // ==============================

        entrada.nextLine();

        System.out.println();
        System.out.println("======================================");
        System.out.println("         ENDERECO DE ENTREGA");
        System.out.println("======================================");

        System.out.print("Digite o endereco: ");
        String endereco = entrada.nextLine();

        double taxaEntrega = 5;

        // ==============================
        // CALCULO
        // ==============================

        double subtotal =
                subtotalPizzas
                        + subtotalAdicionais
                        + subtotalBordas
                        + subtotalBebidas;

        double total = subtotal + taxaEntrega;

        // ==============================
        // RESUMO DO PEDIDO
        // ==============================

        System.out.println();
        System.out.println("======================================");
        System.out.println("          RESUMO DO PEDIDO");
        System.out.println("======================================");

        System.out.println();
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);

        System.out.println();
        System.out.println("PIZZAS:");

        for (int i = 0; i < pizzas.size(); i++) {

            System.out.printf(
                    "%d - %s - R$ %.2f%n",
                    i + 1,
                    pizzas.get(i),
                    precosPizzas.get(i)
            );

            System.out.println(
                    "    Ingredientes: " + ingredientes.get(i)
            );

            System.out.printf(
                    "    Borda: %s - R$ %.2f%n",
                    bordas.get(i),
                    precosBordas.get(i)
            );

            System.out.printf(
                    "    Adicionais: %s - R$ %.2f%n",
                    adicionais.get(i),
                    precosAdicionais.get(i)
            );

            double totalPizza =
                    precosPizzas.get(i)
                            + precosBordas.get(i)
                            + precosAdicionais.get(i);

            System.out.printf(
                    "    Total da pizza: R$ %.2f%n",
                    totalPizza
            );

            System.out.println();
        }

        if (bebidas.size() > 0) {

            System.out.println("BEBIDAS:");

            for (int i = 0; i < bebidas.size(); i++) {

                System.out.printf(
                        "%d - %s - R$ %.2f%n",
                        i + 1,
                        bebidas.get(i),
                        precosBebidas.get(i)
                );
            }
        }

        System.out.println();

        System.out.printf("Subtotal das pizzas: R$ %.2f%n", subtotalPizzas);
        System.out.printf("Subtotal dos adicionais: R$ %.2f%n", subtotalAdicionais);
        System.out.printf("Subtotal das bordas: R$ %.2f%n", subtotalBordas);
        System.out.printf("Subtotal das bebidas: R$ %.2f%n", subtotalBebidas);
        System.out.printf("Taxa de entrega: R$ %.2f%n", taxaEntrega);
        System.out.printf("TOTAL: R$ %.2f%n", total);

        // ==============================
        // PAGAMENTO
        // ==============================

        System.out.println();
        System.out.println("======================================");
        System.out.println("             PAGAMENTO");
        System.out.println("======================================");

        System.out.println("1 - PIX");
        System.out.println("2 - Dinheiro");
        System.out.println("3 - Debito");
        System.out.println("4 - Credito");

        System.out.print("Escolha a forma de pagamento: ");

        int formaPagamento = entrada.nextInt();

        while (formaPagamento < 1 || formaPagamento > 4) {
            System.out.print("Opcao invalida. Escolha de 1 a 4: ");
            formaPagamento = entrada.nextInt();
        }

        String pagamento = "";
        double valorPago = total;
        double troco = 0;

        if (formaPagamento == 1) {

            pagamento = "PIX";

            System.out.println();
            System.out.println("Chave PIX:");
            System.out.println("pizzariamiguel@teste.com");

            String valorPix =
                    String.format("%.2f", total)
                            .replace(",", ".");

            String qrCode =
                    "https://api.qrserver.com/v1/create-qr-code/"
                            + "?size=250x250&data="
                            + "PIX%20Pizzaria%20Miguel%20Valor%20"
                            + valorPix;

            System.out.println();
            System.out.println("QR CODE PARA PAGAMENTO:");
            System.out.println(qrCode);

            System.out.println();
            System.out.println("PIX de demonstracao.");
            System.out.println("Chave ficticia para o projeto.");

        } else if (formaPagamento == 2) {

            pagamento = "Dinheiro";

            System.out.print("Digite o valor recebido: R$ ");

            valorPago = entrada.nextDouble();

            while (valorPago < total) {

                System.out.println("Valor insuficiente.");

                System.out.printf(
                        "Faltam R$ %.2f%n",
                        total - valorPago
                );

                System.out.print("Digite outro valor recebido: R$ ");
                valorPago = entrada.nextDouble();
            }

            troco = valorPago - total;

            System.out.printf(
                    "Troco: R$ %.2f%n",
                    troco
            );

        } else if (formaPagamento == 3) {

            pagamento = "Debito";

        } else if (formaPagamento == 4) {

            pagamento = "Credito";
        }

        // ==============================
        // CPF NA NOTA
        // ==============================

        entrada.nextLine();

        System.out.println();
        System.out.println("======================================");
        System.out.println("             CPF NA NOTA");
        System.out.println("======================================");

        System.out.print(
                "Deseja incluir CPF na nota? 1 - Sim / 2 - Nao: "
        );

        int opcaoCpf = entrada.nextInt();

        String cpf = "Nao informado";

        if (opcaoCpf == 1) {

            entrada.nextLine();

            System.out.print("Digite o CPF: ");
            cpf = entrada.nextLine();

            cpf = cpf.replace(".", "").replace("-", "");

            if (cpf.length() == 11) {

                cpf = cpf.substring(0, 3) + "."
                        + cpf.substring(3, 6) + "."
                        + cpf.substring(6, 9) + "-"
                        + cpf.substring(9, 11);
            }
        }

        // ==============================
        // FINAL DO PEDIDO
        // ==============================

        int numeroPedido = 157;

        System.out.println();
        System.out.println("======================================");
        System.out.println("         PEDIDO FINALIZADO");
        System.out.println("======================================");

        System.out.println(
                "Numero do pedido: " + numeroPedido
        );

        System.out.println(
                "Cliente: " + nomeCliente
        );

        System.out.println(
                "Telefone: " + telefone
        );

        System.out.println(
                "Endereco: " + endereco
        );

        System.out.println(
                "Forma de pagamento: " + pagamento
        );

        System.out.println(
                "CPF na nota: " + cpf
        );

        System.out.printf(
                "Valor total: R$ %.2f%n",
                total
        );

        if (formaPagamento == 2) {

            System.out.printf(
                    "Valor recebido: R$ %.2f%n",
                    valorPago
            );

            System.out.printf(
                    "Troco: R$ %.2f%n",
                    troco
            );
        }

        System.out.println();
        System.out.println("Status: Pedido recebido");
        System.out.println();

        System.out.println(
                "Seu pedido foi recebido com sucesso e ja esta sendo preparado."
        );

        System.out.println(
                "A Pizzaria Miguel agradece a preferencia!"
        );

        entrada.close();
    }
}