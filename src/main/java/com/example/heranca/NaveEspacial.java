package com.example.heranca;

public class NaveEspacial  {
    private String nome;
    private int velocidade;

    public NaveEspacial(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public void voar() {
        System.out.println(nome + " está voando a uma velocidade de " + velocidade + " km/h.");
    }

    public String getNome() {
        return nome;
    }
    
}
