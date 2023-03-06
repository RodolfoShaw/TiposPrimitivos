package exercicios;

import javax.swing.JOptionPane;

public class DescontoProduto {

    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));

        if (valorProduto < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! O valor deve ser maior ou igual a zero.");
        } else {
            double desconto;
            if (valorProduto <= 50) {
                desconto = valorProduto * 0.05;
            } else if (valorProduto <= 100) {
                desconto = valorProduto * 0.1;
            } else {
                desconto = valorProduto * 0.15;
            }

            double valorComDesconto = valorProduto - desconto;

            String mensagem = "Produto: " + nomeProduto + "\n"
                    + "Valor original: R$ " + valorProduto + "\n"
                    + "Valor com desconto: R$ " + valorComDesconto;
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}