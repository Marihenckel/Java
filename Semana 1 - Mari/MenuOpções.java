import java.util.Scanner;

public class MenuOpções {
    public static void main(String[] args) {

        System.out.println("Menu de Opções:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção (1-5): ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        while (opcao <=4) {
            if (opcao == 1) {
            System.out.println("Digite o primeiro numero");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int num2 = scanner.nextInt();
            int soma = num1 + num2;
            System.out.println("A soma é: " + soma);
            System.out.println("Menu de Opções:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção (1-5): ");
        opcao = scanner.nextInt();
        } else if (opcao == 2) {
            System.out.println("Digite o primeiro numero");     
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int num2 = scanner.nextInt();
            int subtracao = num1 - num2;
            System.out.println("A subtração é: " + subtracao);
            System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção (1-5): ");
        opcao = scanner.nextInt();
        } else if (opcao == 3) {
            System.out.println("Digite o primeiro numero");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int num2 = scanner.nextInt();
            if (num2 != 0) {
                double divisao = (double) num1 / num2;
                System.out.println("A divisão é: " + divisao);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção (1-5): ");
        opcao = scanner.nextInt();
        } else if (opcao == 4) {
            System.out.println("Digite o primeiro numero");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int num2 = scanner.nextInt();
            int multiplicacao = num1 * num2;
            System.out.println("A multiplicação é: " + multiplicacao);
        
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção (1-5): ");
        opcao = scanner.nextInt();
    } else if (opcao == 5) {
            System.out.println("Saindo do programa.");
            scanner.close();
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            scanner.close();
        
        }}}
    }

