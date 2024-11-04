import java.util.Scanner;
public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tipoForma;
        double lado1;
        double lado2;
        double lado3;
        double base;
        double altura;
        double resultadoArea;
        double resultadoPerimetro;
        double baseMaior;
        double basemenor;

        System.out.println("Qual figura geomètrica voce gostaria calcular a área e o perímetro ? ");
        System.out.println("1- Quadrado" + "\n2- trinângulo" + "\n3- retângulo" + "\n4- Trapézio");
        tipoForma = entrada.nextInt();

        if (tipoForma < 1 || tipoForma > 4) {
            System.out.println("Valor incorreto inserido");
            return;
        } else if (tipoForma == 1) {
            System.out.println("Insira os valores pedidos abaixo ");
            System.out.println("Lado 1: ");
            lado1 = entrada.nextDouble();
            System.out.println("Lado 2: ");
            lado2 = entrada.nextDouble();

            resultadoArea = lado1 * lado2;
            resultadoPerimetro = lado1 * 4;

            System.out.println("Área: " + resultadoArea+ "m²");
            System.out.println("Perímetro: " + resultadoPerimetro+ "m");
            return;


        } else if (tipoForma == 2) {
            System.out.println("Insira os valores pedidos abaixo ");
            System.out.println("Base: ");
            base = entrada.nextDouble();
            System.out.println("Altura: ");
            altura = entrada.nextDouble();

            System.out.println("Lado 1:");
             lado1 = entrada.nextDouble();

            System.out.println("Lado 2:");
            lado2 = entrada.nextDouble();

            System.out.println("Lado 3: ");
             lado3= entrada.nextDouble();

            resultadoArea = (base * altura)/2 ;
            resultadoPerimetro = lado1 + lado2 + lado3 ;

            System.out.println("Área: " + resultadoArea + "m²");
            System.out.println("Perímetro: " + resultadoPerimetro + "m");
            return;


        }else if (tipoForma == 3) {
            System.out.println("Insira o valores pedidos abaixo");
            System.out.println("Base: ");
            base = entrada.nextDouble();
            System.out.println("Altura: ");
             altura = entrada.nextDouble();

            resultadoArea = base * altura;
            resultadoPerimetro = 2*(base + altura);

            System.out.println("Área: " + resultadoArea + "m²");
            System.out.println("Perímetro: " + resultadoPerimetro + "m");
            return;


        }
        else if (tipoForma == 4) {
            System.out.println("Insira o valores pedidos abaixo");

            System.out.println("Base maior: ");
            baseMaior = entrada.nextDouble();

            System.out.println("Base menor: ");
            basemenor = entrada.nextDouble();

            System.out.println("altura: ");
            altura = entrada.nextDouble();

            System.out.println("Lado 1:");
            lado1 = entrada.nextDouble();

            System.out.println("Lado 2:");
            lado2 = entrada.nextDouble();



            resultadoArea = ((baseMaior + basemenor) * altura)/2;
            resultadoPerimetro = baseMaior + basemenor + lado1 + lado2;

            System.out.println("Área: " + resultadoArea + "m²");
            System.out.println("Perímetro: " + resultadoPerimetro + "m");
            return;


        }
    }
}
