package org.example;

import java.time.LocalDate;
import java.util.*;

public class Vendedor extends Funcionario {

    private double comissao;
    private Map<LocalDate, Double> vendasPorData;
    private List<Double> vendasComissao = new ArrayList<>();


    public Vendedor(String nome) {
        this.nome = nome;
        this.vendasPorData = new HashMap<>();
    }

    public void AdicionarVenda(LocalDate data, double valor) {
        vendasPorData.put(data, valor);
    }
    public double getVendasPorData(LocalDate data) {
        return vendasPorData.getOrDefault(data, 0.0);
    }



    public double getBeneficio(double salario, int ano, int mes) {
        double comissaoMensal = 0.0;

        for (LocalDate dataVenda : vendasPorData.keySet()) {
            if (dataVenda.getYear() == ano && dataVenda.getMonthValue() == mes) {
                comissaoMensal += vendasPorData.get(dataVenda) * 0.30;
            }
        }

        return salario + comissaoMensal;
    }



    @Override
    public double getBonusSalario(double salario, LocalDate dataContrato, int mes, int ano) {
        int anoContrato = ano - dataContrato.getYear();

        if (anoContrato > 0) {
            return salario + 1800 * anoContrato;
        } else {
            return salario;
        }
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
