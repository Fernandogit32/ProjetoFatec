package com.company;

public class Veiculo implements Entravel {
    public String placa;
    public String marca;
    public String cor;


    @Override
    public void entrou() {
        GerenciarEntrada.adentros.add(this);
    }

    @Override
    public void saiu() {
        GerenciarEntrada.adentros.remove(this);
    }
}
