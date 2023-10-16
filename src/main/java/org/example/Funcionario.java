package org.example;

import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected LocalDate dataContrato;
    protected double salario;

    public abstract double getBeneficio(double salario, int ano, int mes);

    public abstract double getBonusSalario(double salario, LocalDate dataContrato, int mes, int ano);



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}




