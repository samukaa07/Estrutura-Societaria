package org.example.model;

public class Pessoa {

    private String nome;
    private double bensImoveis;

    public Pessoa(String nome, double bensImoveis) {
        this.nome = nome;
        this.bensImoveis = bensImoveis;
    }

    public String getNome() {
        return nome;
    }

    public double getBensImoveis() {
        return bensImoveis;
    }
}
