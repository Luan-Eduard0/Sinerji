package org.example;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    @Override
    public double getBeneficio(double salario, int ano, int mes) {
        return salario * 0;
    }

    @Override
    public double getBonusSalario(double salario, LocalDate dataContrato, int mes, int ano) {
        int anoContrato = ano - dataContrato.getYear();
        if (anoContrato >= 1) {
            return salario + (3000 * anoContrato);

        } else {
            return salario;
        }

    }




    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", dataContrato=" + dataContrato +
                ", salario=" + salario +
                '}';
    }
}