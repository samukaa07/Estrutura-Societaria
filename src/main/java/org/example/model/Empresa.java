package org.example.model;

import java.util.HashSet;
import java.util.Set;

public class Empresa extends PessoaJuridica{

    // Conjunto para armazenar os sócios da empresa.
    private Set<Pessoa> socios;

    // Construtor da classe Empresa. Inicializa a empresa com nome, bens imóveis e CNPJ.
    public Empresa(String nome, double bensImoveis, String cnpj) {
        super(nome, bensImoveis, cnpj);
        this.socios = new HashSet<>();
    }

    public void adicionarSocio(Pessoa socio) {
        socios.add(socio); // Adiciona o sócio ao conjunto. HashSet garante que não haverá duplicatas.
    }

    public Set<Pessoa> getSocios() {
        return socios;  // Retorna o conjunto de sócios.
    }

    // Método público que inicia o cálculo do total de bens imóveis.
    public double calcularTotalBensImoveis() {
        Set<Pessoa> visitados = new HashSet<>();
        return calcularTotalBensImoveis(this, visitados);
    }

    private double calcularTotalBensImoveis(Pessoa pessoa, Set<Pessoa> visitados) {
        if (visitados.contains(pessoa)) {
            return 0; // Se a pessoa já foi visitada, retorna 0 para evitar duplicidade.
        }
        visitados.add(pessoa);
        double total = pessoa.getBensImoveis();
        if (pessoa instanceof Empresa) {
            Empresa empresa = (Empresa) pessoa;
            for (Pessoa socio : empresa.getSocios()) {
                total += calcularTotalBensImoveis(socio, visitados);
            }
        }
        return total; // Retorna o total de bens imóveis.
    }
}
