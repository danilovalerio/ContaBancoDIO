package com.danilo.projetos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao ByteBank, por favor entre com seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, entre com a sua agência: ");
        agencia = input.nextLine();

        System.out.println("Por favor, entre com o número da conta: ");
        numero = input.nextInt();

        System.out.println("Por favor, entre com o valor do seu saldo: ");
        saldo = input.nextDouble();

        String msg = "Olá, ".concat(nomeCliente).concat( ", obrigado por criar uma conta em nosso banco, sua agência" +
                " e conta são: ").concat(agencia).concat("-").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(saldo.toString())
                .concat( " já está disponível para saque.");


        System.out.println(msg);

        input.close();
    }
}