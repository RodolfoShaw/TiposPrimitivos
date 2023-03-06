package exercicios;

import java.util.Scanner;

public class SistemaDeLogin {
    private String loginCorreto = "Senha";
    private String senhaCorreta = "Senha";
    private int tentativasRestantes = 3;

    public void solicitarLoginSenha() {
        Scanner sc = new Scanner(System.in);
        while (tentativasRestantes > 0) {
            System.out.print("Digite seu login: ");
            String login = sc.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido.");
                return;
            }

            tentativasRestantes--;
            if (tentativasRestantes > 0) {
                System.out.printf("Login ou senha incorretos. Tentativas restantes: %d.\n", tentativasRestantes);
            } else {
                System.out.println("Número máximo de tentativas atingido. Acesso negado.");
            }
        }
       
    }
}