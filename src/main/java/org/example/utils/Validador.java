package org.example.utils;

public class Validador {

    public static boolean validarCPF(String cpf) {
        // Verifica se o CPF segue o padrão "xxx.xxx.xxx-xx"
        return cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public static boolean validarCNPJ(String cnpj) {
        //  Verifica se o CNPJ segue o formato "xx.xxx.xxx/xxxx-xx"
        return cnpj != null && cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
    }
}
