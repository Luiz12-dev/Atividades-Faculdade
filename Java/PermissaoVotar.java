import java.util.Scanner;
public class PermissaoVotar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Seja bem vindo ao sistema de votação online !"+ "\nDigite sua idade para prosseguir:");
        idade = entrada.nextInt();
        if (idade ==0 ||  idade >= 100){
            System.out.println("Valor incorreto inserido!!");

        }else if (idade >=18 ){
            System.out.println("Voce esta apto para votar, pode prosseguir !");

        }
        else if(idade <18){
            System.out.println("Erro, idade inferior a 18 não esta apto para votar!!");
        }
    }
}
