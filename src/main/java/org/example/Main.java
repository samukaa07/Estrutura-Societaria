package org.example;

import org.example.model.Empresa;
import org.example.model.PessoaFisica;

public class Main {
    public static void main(String[] args) {

        //Criação de pessoas físicas
        PessoaFisica pf1 = new PessoaFisica("Pessoa Física 1", 100000.0, "123.456.789-00");
        PessoaFisica pf2 = new PessoaFisica("Pessoa Física 2", 200000.0, "123.456.789-01");
        PessoaFisica pf3 = new PessoaFisica("Pessoa Física 3", 150000.0, "123.456.789-02");
        PessoaFisica pf4 = new PessoaFisica("Pessoa Física 4", 300000.0, "123.456.789-03");
        PessoaFisica pf5 = new PessoaFisica("Pessoa Física 5", 250000.0, "123.456.789-04");

        // Criação de empresas
        Empresa empresaA = new Empresa("Empresa A", 500000.0, "12.345.678/0001-00");
        Empresa empresaB = new Empresa("Empresa B", 300000.0, "12.345.678/0002-00");
        Empresa empresaC = new Empresa("Empresa C", 400000.0, "12.345.678/0003-00");
        Empresa empresaD = new Empresa("Empresa D", 350000.0, "12.345.678/0004-00");

        // Definindo estrutura societária
        empresaA.adicionarSocio(pf1);
        empresaA.adicionarSocio(pf2);
        empresaA.adicionarSocio(empresaD);

        empresaD.adicionarSocio(pf4);
        empresaD.adicionarSocio(pf5);
        empresaD.adicionarSocio(empresaC);

        empresaC.adicionarSocio(pf3);
        empresaC.adicionarSocio(empresaB);

        empresaB.adicionarSocio(pf1);

        // Calcular e exibir o total de bens imóveis
        System.out.println("Total de bens imóveis da Empresa A: " + empresaA.calcularTotalBensImoveis());
        System.out.println("Total de bens imóveis da Empresa B: " + empresaB.calcularTotalBensImoveis());
        System.out.println("Total de bens imóveis da Empresa C: " + empresaC.calcularTotalBensImoveis());
        System.out.println("Total de bens imóveis da Empresa D: " + empresaD.calcularTotalBensImoveis());
    }
}