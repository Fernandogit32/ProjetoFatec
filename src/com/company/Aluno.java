package com.company;

public class Aluno extends Pessoa implements Entravel {
    public int ra;
    public String curso;

    @Override
    public void entrou() {
        GerenciarEntrada.adentros.add(this);
    }

    @Override
    public void saiu() {
        GerenciarEntrada.adentros.remove(this);
    }
}
