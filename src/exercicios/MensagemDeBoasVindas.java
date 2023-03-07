package exercicios;

import javax.swing.JOptionPane;

public class MensagemDeBoasVindas {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
        JOptionPane.showMessageDialog(null, "Olá " + nome + "! É um prazer te conhecer!");
    }
    
}