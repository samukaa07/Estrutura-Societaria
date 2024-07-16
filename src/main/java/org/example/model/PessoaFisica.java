package org.example.model;

import org.example.utils.Validador;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, double bensImoveis, String cpf) {
        super(nome, bensImoveis);
        if (!Validador.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
