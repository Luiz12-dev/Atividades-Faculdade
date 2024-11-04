import java.util.Scanner;
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;


        System.out.println("Insira os valores referentes aos 3 lados do triângulo ");

        System.out.println("Lado 1: ");
        lado1 = entrada.nextDouble();

        System.out.println("Lado 2: ");
        lado2 = entrada.nextDouble();


        System.out.println("Lado 3: ");
        lado3 = entrada.nextDouble();

        if( lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é equilátero !");
            return;
        }
        else if(lado1 == lado2  && lado3 != lado2){
            System.out.println("O triângulo é isóscelis !");
            return;

        }else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("O trinângulo é escaleno !");
            return;


     }

        }


}
