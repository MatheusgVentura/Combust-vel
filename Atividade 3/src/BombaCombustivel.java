public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double totalAbastecido;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.totalAbastecido = 0.0;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } else {
            quantidadeCombustivel -= litros;
            totalAbastecido += valor;
            System.out.printf("Você abasteceu %.2f litros. Valor total: R$ %.2f%n", litros, valor);
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } else {
            quantidadeCombustivel -= litros;
            totalAbastecido += valor;
            System.out.printf("Valor a ser pago: R$ %.2f%n", valor);
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
        System.out.printf("O novo valor do litro é R$ %.2f%n", novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
        System.out.printf("O tipo de combustível foi alterado para %s%n", novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
        System.out.printf("A quantidade de combustível foi alterada para %.2f litros%n", novaQuantidade);
    }

    public double getTotalAbastecido() {
        return totalAbastecido;
    }
}
