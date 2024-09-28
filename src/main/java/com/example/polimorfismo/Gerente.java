package com.example.polimorfismo;

public class Gerente extends Funcionario{
    @Override
    public void realizarTarefa() {
        System.out.println("Gerenciando a equipe.");
    }
    
}
