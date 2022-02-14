import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double height;
        double weight;
        double imc;

        System.out.println("Digite o seu nome: ");
        name = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        age = scan.nextInt();

        System.out.println("Digite a sua altura: ");
        height = scan.nextDouble();

        System.out.println("Digite o seu peso: ");
        weight = scan.nextDouble();

        imc = weight / (height * height);
        System.out.println(imc);

        if (imc < 18.5) System.out.println(name + ", você tem " + age + " anos e está abaixo do Peso!");
        else if (imc >= 18.5 && imc <= 24.9) System.out.println(name + ", você tem " + age + " anos e está no Peso Normal :)");
        else if (imc >= 25.0 && imc <= 29.9) System.out.println(name + ", você tem " + age + " anos e está Sobrepeso :(");
        else if (imc >= 30.0 && imc <= 34.9) System.out.println(name + ", você tem " + age + " anos e está com Obesidade Grau 1!");
        else if (imc >= 35.0 && imc <= 39.9) System.out.println(name + ", você tem " + age + " anos e está com Obesidade Grau 2!");
        else if (imc >= 40.0) System.out.println(name + ", você tem " + age + " anos e está com Obesidade Mórbida!");
        else System.out.println("Você tem um IMC inválido");
    }
}
