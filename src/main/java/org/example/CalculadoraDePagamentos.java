package org.example;

import java.time.LocalDate;
import java.util.List;

public class CalculadoraDePagamentos {
    public double calcularTotalPago(List<Funcionario> funcionarios, int ano, int mes) {
        double totalPago = 0;
        for (Funcionario funcionario : funcionarios) {

            LocalDate dataContrato = funcionario.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();
            double salario = funcionario.getSalario();
            double beneficio = funcionario.getBeneficio(salario, ano, mes);
            double bonusSalario = funcionario.getBonusSalario(salario, dataContrato, mes, ano);
            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    totalPago += beneficio + bonusSalario;

                } else if (ano > anoContrato) {
                    totalPago += beneficio + bonusSalario;
                } else {
                    System.out.println("Funcionario não contratado no mês especificado");
                }

            }
        }

        return totalPago;
    }

    public double calcularTotalBeneficios(List<Funcionario> funcionarios, int ano, int mes) {
        double totalBeneficios = 0.0;

        for (Funcionario funcionario : funcionarios) {
            LocalDate dataContrato = funcionario.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();
            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    totalBeneficios += funcionario.getBeneficio(funcionario.getSalario(), ano, mes);
                } else if (ano > anoContrato) {
                    totalBeneficios += funcionario.getBeneficio(funcionario.getSalario(), ano, mes);
                } else {
                    System.out.println("Funcionário não contratado no mês especificado");
                }
            }
        }

        return totalBeneficios;
    }
    public double calcularTotalSalarios(List<Funcionario> funcionarios, int ano, int mes) {
        double totalSalarios = 0.0;

        for (Funcionario funcionario : funcionarios) {
            LocalDate dataContrato = funcionario.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();
            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    totalSalarios += funcionario.getSalario() ;
                } else if (ano > anoContrato) {
                    totalSalarios += funcionario.getSalario();
                } else {
                    System.out.println("Funcionário não contratado no mês especificado");
                }
            }
        }

        return totalSalarios;
    }


    public Funcionario funcionarioMaiorValorMes(List<Funcionario> funcionarios, int ano, int mes) {
        Funcionario funcionarioComMaiorValor = null;
        double maiorValor = 0;

        for (Funcionario funcionario : funcionarios) {
            LocalDate dataContrato = funcionario.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();
            double salario = funcionario.getSalario();
            double beneficio = funcionario.getBeneficio(salario, ano, mes);
            double bonusSalario = funcionario.getBonusSalario(salario, dataContrato, mes, ano);
            double valorTotal = beneficio + bonusSalario;
            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    if (valorTotal > maiorValor) {
                        maiorValor = valorTotal;
                        funcionarioComMaiorValor = funcionario;
                    }
                } else if (ano > anoContrato) {
                    if (valorTotal > maiorValor) {
                        maiorValor = valorTotal;
                        funcionarioComMaiorValor = funcionario;
                    }
                } else {
                    System.out.println("Funcionario não contratado no mês especificado");
                }


            }
        }
        return funcionarioComMaiorValor;

    }

    public String nomeFuncionarioMaiorBeneficio(List<Funcionario> funcionarios, int ano, int mes) {
        Funcionario funcionarioComMaiorBeneficio = null;
        double maiorBeneficio = 0;

        for (Funcionario funcionario : funcionarios) {
            LocalDate dataContrato = funcionario.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();

            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    double beneficio = funcionario.getBeneficio(funcionario.getSalario(), ano, mes);
                    if (beneficio > maiorBeneficio) {
                        maiorBeneficio = beneficio;
                        funcionarioComMaiorBeneficio = funcionario;
                    }
                } else if (ano > anoContrato) {
                    double beneficio = funcionario.getBeneficio(funcionario.getSalario(), ano, mes);
                    if (beneficio > maiorBeneficio) {
                        maiorBeneficio = beneficio;
                        funcionarioComMaiorBeneficio = funcionario;
                    }
                }
            }

        }
        if (funcionarioComMaiorBeneficio != null) {
            return funcionarioComMaiorBeneficio.getNome();
        } else {
            return "Nenhum funcionário com benefício encontrado no mês especificado.";
        }
    }

    public Vendedor vendedorMaiorVendas(List<Vendedor> vendedores, int ano, int mes) {
        Vendedor vendedorComMaiorVendas = null;
        double maiorVendas = 0;

        for (Vendedor vendedor : vendedores) {
            LocalDate dataContrato = vendedor.getDataContrato();
            int anoContrato = dataContrato.getYear();
            int mesContrato = dataContrato.getMonthValue();

            if (ano >= anoContrato) {
                if (mes >= mesContrato) {
                    double vendas = vendedor.getVendasPorData(LocalDate.of(ano, mes, 1));
                    if (vendas > maiorVendas) {
                        maiorVendas = vendas;
                        vendedorComMaiorVendas = vendedor;
                    }
                } else if (ano > anoContrato) {
                    double vendas = vendedor.getVendasPorData(LocalDate.of(ano, mes, 1));
                    if (vendas > maiorVendas) {
                        maiorVendas = vendas;
                        vendedorComMaiorVendas = vendedor;
                    }
                }
            }
        }
        return vendedorComMaiorVendas;
    }
}


