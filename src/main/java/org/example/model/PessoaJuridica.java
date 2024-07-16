package org.example.model;

import org.example.utils.Validador;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, double bensImoveis, String cnpj) {
        super(nome, bensImoveis);
        if (!Validador.validarCNPJ(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido");
        }

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
