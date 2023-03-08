package exercicios;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Ex8Cond {

    public static void main(String[] args) {
        
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            
            String nome = JOptionPane.showInputDialog(null, "Informe o nome da " + i + "ª pessoa:");
            
            String dataNascimentoStr;
            LocalDate dataNascimento;
            int idade;
            try {
                dataNascimentoStr = JOptionPane.showInputDialog(null, "Informe a data de nascimento da " + i + "ª pessoa (formato dd/mm/aaaa):");
                dataNascimento = LocalDate.parse(dataNascimentoStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                idade = Period.between(dataNascimento, LocalDate.now()).getYears();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida!");
                i--; // volta uma iteração para repetir a entrada dos dados
                continue;
            }
            
            if (idade < idadeMaisNova) {
                nomeMaisNovo = nome;
                idadeMaisNova = idade;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A pessoa mais nova é " + nomeMaisNovo + ", com " + idadeMaisNova + " anos de idade.");
    }
}
