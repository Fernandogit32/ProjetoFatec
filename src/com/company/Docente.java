package com.company;

public class Docente extends Funcionario implements Entravel {
    public String graduacao;

    @Override
    public void entrou() {
        GerenciarEntrada.adentros.add(this);
    }

    @Override
    public void saiu() {
        GerenciarEntrada.adentros.remove(this);
    }
}
