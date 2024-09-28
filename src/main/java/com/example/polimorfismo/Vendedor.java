package com.example.polimorfismo;

public class Vendedor extends Funcionario{
    @Override
    public void realizarTarefa() {
        System.out.println("Vendendo produtos.");
    }
}
