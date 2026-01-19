import java.util.Scanner;

public class VariaveisETipos {

    public static void main(String[] args) {
               

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto do usuário
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro do usuário
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble(); // Lê um número de ponto flutuante do usuário
        System.out.println("Digite seu gênero (M/F): ");
        char genero = scanner.next().charAt(0); // Lê um caractere do usuário
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos

        // Exibição dos valores das variáveis no console
        if (idade > 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        System.out.println("Seu nome é: " + nome + ", você tem " + idade + " anos, sua altura é " + altura + " metros e seu gênero é " + (genero == 'M' ? "Masculino" : "Feminino") + ".");
        
       
    }
}