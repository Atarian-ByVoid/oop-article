package com.example.heranca;

public class Battlestar extends NaveEspacial {
    private int numeroDeFoguetes;

    public Battlestar(String nome, int velocidade, int numeroDeFoguetes) {
        super(nome, velocidade);
        this.numeroDeFoguetes = numeroDeFoguetes;
    }

    public void atacar() {
        System.out.println(getNome() + " está atacando com " + numeroDeFoguetes + " foguetes!");
    }
}

