import java.util.Scanner;
import java.util.List;
import java .util.ArrayList;

public class Estoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        List<String> itens = new ArrayList<>();
        List <Integer> quantidades = new ArrayList<>();

        itens.add("Arroz");
        quantidades.add(10);

        itens.add("Feijão");
        quantidades.add(8);

        final int QuantidadeMinima = 5;
        System.out.println("Analise de estoque em andamento");

        for(int i= 0; i < itens.size(); i++ ){
            String item = itens.get(i);
            int quantidade = quantidades.get(i);


            if(quantidade <= QuantidadeMinima){
                System.out.println("O item " + item + "Precisa de reposição "+ "\nQuantidade:"+ quantidade);


            }else {
                System.out.println("O item "+ item +"Esta com estoque suficiente" + "\nquantidade no estoque: "+ quantidade );
            }

        }













    }
}
