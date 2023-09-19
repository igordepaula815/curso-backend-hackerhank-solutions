package Exercicios.Fundamentos;

import java.time.Month;

public class questao3 {

    public static void main(String[] args) {
        // Dados do faturamento diário da distribuidora
        double[] faturamentoDiario = {1500.0, 2200.0, 1800.0, 0.0, 0.0, 2100.0, 2400.0, 1700.0, 1900.0, 2000.0,
                2500.0, 2300.0, 1700.0, 0.0, 0.0, 2000.0, 1800.0, 2100.0, 2200.0, 1900.0, 2000.0, 2400.0, 2600.0,
                2300.0, 1800.0, 0.0, 0.0, 2200.0, 2000.0, 2100.0};

        // Número de dias do mês
        int numDiasMes = Month.MARCH.maxLength();

        // Calcula o menor valor de faturamento
        double menorFaturamento = faturamentoDiario[0];
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }
        }

        // Calcula o maior valor de faturamento
        double maiorFaturamento = faturamentoDiario[0];
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
        }

        // Calcula a média mensal de faturamento, ignorando os dias sem faturamento
        double somaFaturamento = 0.0;
        int numDiasComFaturamento = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > 0.0) {
                somaFaturamento += faturamentoDiario[i];
                numDiasComFaturamento++;
            }
        }
        double mediaMensalFaturamento = somaFaturamento / numDiasComFaturamento;

        // Calcula o número de dias no mês em que o valor de faturamento diário foi superior à média mensal
        int numDiasAcimaDaMedia = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > mediaMensalFaturamento) {
                numDiasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);



    }}
