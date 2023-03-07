package exercicios;

import javax.swing.JOptionPane;

public class NomeSalario {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));
        JOptionPane.showMessageDialog(null, "Olá " + nome + "! É um prazer te conhecer!\nO salário digitado foi: " + salario);
    }

}
