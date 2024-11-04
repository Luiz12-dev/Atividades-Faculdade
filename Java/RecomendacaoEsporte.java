
import java.util.Scanner;
public class RecomendacaoEsporte {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int TipoAtividade;
        int ClimaAtual;


        System.out.println("Seja bem vindo ao programa de recomendações de atividades de lazer!!");
        System.out.println("Escolha uma atividade de lazer entre as duas seguintes:");
        System.out.println("1- Esportes" + "\n2- Artes");
        TipoAtividade = Entrada.nextInt();

        if(TipoAtividade <1 || TipoAtividade >2  ) {
            System.out.println("Valor incorreto inserido!!");

        }else {
            System.out.println("Como esta o clima hoje ?"+ "\n1- Ensolarado"+ "\n2- Chuvoso");
            ClimaAtual = Entrada.nextInt();
            if(TipoAtividade == 1 && ClimaAtual==1){
                System.out.println("Recomendação: ");

                System.out.println("Evento esportivo acontecendo na cidade.");
            }
            else if(TipoAtividade == 1 && ClimaAtual ==2){
                System.out.println("Recomendação: ");

                System.out.println("Evento esportivo transmitido pela TV ou streaming.");
            }
            else if(TipoAtividade == 2 && ClimaAtual == 1){
                System.out.println("Recomendação: ");

                System.out.println("Teatro ao ar livre");
            }
            else if(TipoAtividade== 2 && ClimaAtual == 2){
                System.out.println("Recomendação: ");

                System.out.println("Filme transmitido pela TV ou Streaming");
            }

        }

    }
}
