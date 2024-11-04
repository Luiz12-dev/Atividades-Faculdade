import java.util.Scanner;
public class NotasAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;



        int materia;



        System.out.println("Qual matéria você gostaria de saber se foi aprovado ou não ?"+ "\n1- Matemática"+ "\n2- História ");
        materia = entrada.nextInt();

        if(materia < 1 || materia >2){
            System.out.println("Valor incorreto inserido !");
            return;
        }else if (materia ==1){






            System.out.println("Informe sua nota da primeira prova: ");
            nota1 = entrada.nextDouble();

            if (nota1 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;

            }

            System.out.println("Informe sua nota da segunda prova: ");
            nota2 = entrada.nextDouble();

            if (nota2 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;
            }

            System.out.println("Informe sua nota da terceira prova: ");
            nota3 = entrada.nextDouble();

            if (nota3 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;
            }

            media =( nota1 + nota2 + nota3 )/3;
            System.out.printf("Sua média foi:  %.1f ", media);

            if (media > 10 || media <0){

                System.out.println("Valores incorretos inseridos !!");
            }else if( media >=7 ) {
                System.out.println("Aprovado !!");

            }else{
                System.out.println("Reprovado !!");
            }


        } else if (materia ==2) {

            System.out.println("Informe sua nota da primeira prova: ");
            nota1 = entrada.nextDouble();

            if (nota1 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;

            }

            System.out.println("Informe sua nota da segunda prova: ");
            nota2 = entrada.nextDouble();

            if (nota2 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;
            }

            System.out.println("Informe sua nota da terceira prova: ");
            nota3 = entrada.nextDouble();

            if (nota3 > 10){
                System.out.println("Valor incorreto informado!! ");
                return;
            }

            media =( nota1 + nota2 + nota3 )/3;
            System.out.printf("Sua média foi:  %.1f ", media);

            if (media > 10 || media <0){

                System.out.println("Valores incorretos inseridos !!");
            }else if( media >=7 ) {
                System.out.println("Aprovado !!");

            }else{
                System.out.println("Reprovado !!");
            }


        }


    }
}
