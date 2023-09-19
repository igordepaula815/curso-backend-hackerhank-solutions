package Exercicios.Fundamentos;

public class Questao4Rotation {
    public static void main(String[] args) {
        double valorTotal = 0.0;
        double valorSP = 67_836.43;
        double valorRJ = 36_678.66;
        double valorMG = 29_229.88;
        double valorES = 27_165.48;
        double valorOutros = 19_849.53;

        valorTotal = valorSP + valorRJ + valorMG + valorES + valorOutros;

        double percentualSP = (valorSP / valorTotal) * 100.0;
        double percentualRJ = (valorRJ / valorTotal) * 100.0;
        double percentualMG = (valorMG / valorTotal) * 100.0;
        double percentualES = (valorES / valorTotal) * 100.0;
        double percentualOutros = (valorOutros / valorTotal) * 100.0;

        System.out.printf("Percentual de representação por estado:\n");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}




