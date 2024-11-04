import java.util.Scanner;
public class AumentoSalário {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salario;
        double aumento;
        double SalarioPosaumento;


        System.out.println("Insira seu salário para ser calculado seu aumento: ");
        salario = entrada.nextInt();

        if (salario < 1500 || salario > 3500) {
            System.out.println("Valor inserido incorreto");
            return;

        } else if (salario == 1500) {
            aumento = (salario * 0.15);
            SalarioPosaumento = salario + aumento;
            System.out.println("Seu novo salário será: " + SalarioPosaumento+ "$");
            return;
        } else if (salario == 2500) {
            aumento = (salario * 0.10);
            SalarioPosaumento = salario + aumento;
            System.out.println("Seu novo salário será: " + SalarioPosaumento+ "$");
            return;


        } else if (salario == 3500) {
            aumento = (salario * 0.05);
            SalarioPosaumento = salario + aumento;
            System.out.println("Seu novo salário será: " + SalarioPosaumento + "$");
            return;


        }
    }
}
