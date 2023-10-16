    package org.example;

    import java.util.ArrayList;
    import java.util.List;
    import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {

            //O dia é setado como 1 para ignorar essa informação
            //É necessario criar uma lista de vendedores para poder calcular as vendas
            int mes = 01;
            int ano = 2018;

            CalculadoraDePagamentos calculadora = new CalculadoraDePagamentos();
            List<Funcionario> funcionarios = new ArrayList<>();
            List<Vendedor> vendedores = new ArrayList<>();

                Gerente gerente1 = new Gerente();
                gerente1.setNome("Juliana Alves");
                gerente1.setDataContrato(LocalDate.of(2017, 7, 1));
                gerente1.setSalario(20000);
                funcionarios.add(gerente1);


                Gerente gerente2 = new Gerente();
                gerente2.setNome("Bento Albino ");
                gerente2.setDataContrato(LocalDate.of(2014, 3, 1) );
                gerente2.setSalario(20000);
                funcionarios.add(gerente2);




                Vendedor vendedor1 = new Vendedor("Joao Mendes");
                vendedor1.setDataContrato(LocalDate.of(2021,12,1));
                vendedor1.AdicionarVenda(LocalDate.of(2021,12,1), 3400.00);
                vendedor1.AdicionarVenda(LocalDate.of(2022,1,1),  7700.00);
                vendedor1.AdicionarVenda(LocalDate.of(2022,2,1),  5000.00);
                vendedor1.AdicionarVenda(LocalDate.of(2022,3,1),  5900.00);
                vendedor1.AdicionarVenda(LocalDate.of(2022,4,1),  6500.00);

                vendedores.add(vendedor1);

                Vendedor vendedor2 = new Vendedor("Ana Silva");
                vendedor2.setDataContrato(LocalDate.of(2021,12,1));
                vendedor2.AdicionarVenda(LocalDate.of(2021,12,1), 5200.00);
                vendedor2.AdicionarVenda(LocalDate.of(2022,1,1),  4000.00);
                vendedor2.AdicionarVenda(LocalDate.of(2022,2,1),  4200.00);
                vendedor2.AdicionarVenda(LocalDate.of(2022,3,1),  5850.00);
                vendedor2.AdicionarVenda(LocalDate.of(2022,4,1),  7000.00);

                vendedores.add(vendedor2);

                Secretario secretario1 = new Secretario();
                secretario1.setNome("Maria Souza");
                secretario1.setDataContrato(LocalDate.of(2015, 12, 1));
                secretario1.setSalario(7000);
                funcionarios.add(secretario1);

                Secretario secretario2 = new Secretario();
                secretario2.setNome("Jorge Carvalho");
                secretario2.setDataContrato(LocalDate.of(2018, 1, 1));
                secretario2.setSalario(7000);
                funcionarios.add(secretario2);





            double totalSalarioBeneficio = calculadora.calcularTotalPago(funcionarios, ano, mes);
            double totalSalario = calculadora.calcularTotalPago(funcionarios, ano, mes);
            double totalBeneficio = calculadora.calcularTotalBeneficios(funcionarios, ano, mes);
            Funcionario funcionarioMaisAlto = calculadora.funcionarioMaiorValorMes(funcionarios, ano, mes);
            String nomeFuncionarioMaisAltoBeneficio = calculadora.nomeFuncionarioMaiorBeneficio(funcionarios, ano, mes);
            Vendedor vendedorMaisVendas = calculadora.vendedorMaiorVendas(vendedores, ano, mes);



            System.out.println("Total pago (salário + benefício) no mês " + mes + " de " + ano + ": " + totalSalarioBeneficio);
            System.out.println("Total pago apenas em salários no mês " + mes + " de " + ano + ": " + totalSalario);
            System.out.println("Total pago em benefícios no mês " + mes + " de " + ano + ": " + totalBeneficio);

            if (funcionarioMaisAlto != null) {
                System.out.println("Funcionário com maior remuneração no mês " + mes + " de " + ano + ": " + funcionarioMaisAlto.getNome());
            } else {
                System.out.println("Não há funcionários no mês " + mes + " de " + ano);
            }
            if (nomeFuncionarioMaisAltoBeneficio != null) {
                System.out.println("Funcionário com maior benefício no mês " + mes + " de " + ano + ": " + nomeFuncionarioMaisAltoBeneficio);
            } else {
                System.out.println("Não há funcionários com benefício no mês " + mes + " de " + ano);
            }
            if (vendedorMaisVendas != null) {
                System.out.println("Vendedor com maior numero de vendas no mês " + mes + " de " + ano + ": " + vendedorMaisVendas.getNome());
            } else {
                System.out.println("Não há vendedores no mês " + mes + " de " + ano);
            }
        }


        }

