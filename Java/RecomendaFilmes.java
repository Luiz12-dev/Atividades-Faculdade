import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RecomendaFilmes {
    public static void main(String[] args) {

        int opcoes;
        Scanner entrada = new Scanner(System.in);
        List<String> FilmesAcao = new ArrayList<>();
        FilmesAcao.add("1- A origem");
        FilmesAcao.add("2- Batman");
        FilmesAcao.add("3- Jhon wick");



        List<String> FilmesAventura =  Arrays.asList("1- Uncharted: Fora do Mapa" + "\n2- Vigem ao centro da terra"+ "\n3- Na selva");
        List<String> FilmesDrama =  Arrays.asList("1- Guerra Civil" + "\n2- Sozinha"+ "\n3- É assim que acaba");
        List<String> FilmesComedia =  Arrays.asList("1- Gênte Grande " + "\n2- Vizinhos"+ "\n3- Brothers");
        List<String> FilmesTerror =  Arrays.asList("1- A freira " + "\n2- Sobrenatural"+ "\n3- Invocação do mal");











        System.out.println("Qual gênero de filme voce quer recomedações assistir ?");
      System.out.println("\n1- Ação"+"\n2- Aventura"+"\n3- Drama"+"\n4- Comédia"+"\n5- Terror");
        opcoes = entrada.nextInt();


        if(opcoes == 1){
            System.out.println("Recomendações: ");
            for(String nomeAcao : FilmesAcao){
                System.out.println(nomeAcao);

            }

            }else if(opcoes == 2){
            System.out.println("Recomendações: ");


            for(String nomeAventura : FilmesAventura){
                System.out.println(nomeAventura);
            }


        }else if(opcoes == 3){
            System.out.println("Recomendações: ");

            for (String nomeDrama : FilmesDrama){
                System.out.println(nomeDrama);

            }
        }else if(opcoes == 4){
            System.out.println("Recomendações: ");

            for(String nomeComedia : FilmesComedia){
                System.out.println(nomeComedia);

            }
        }else if (opcoes == 5 ){
            System.out.println("Recomendações: ");

            for(String nomeTerror : FilmesTerror){
                System.out.print(nomeTerror);

            }
        }



        if(opcoes < 1 || opcoes >5) {
            System.out.println("Entrada incorreta!!");

        }


    }

}
