package com.company;

public class Administrativo extends Funcionario implements Entravel {
    public String setor;

    @Override
    public void entrou() {
        GerenciarEntrada.adentros.add(this);
    }

    @Override
    public void saiu() {
        GerenciarEntrada.adentros.remove(this);
    }
}
