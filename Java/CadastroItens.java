import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class cadastroItens{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        List<Item> itens = new ArrayList <>();
        
        while(true){
            System.out.println("Digite o nome do item (ou 'sair para encerrar') ");
            String nome = scanner.nexLine();
            if (nome.equalsIgnoreCase("Sair")){
                break;
            }
            System.out.println("Informe o preco do item: ");
            double preco = scanner.nextdouble();
            System.out.println("Informe a quantidade de Itens: ");
            int quantidade = scanner.NextInt();
            scanner.nextLine();
            
            
            Item item = new Item(nome, preco, quantidade);
            itens.add(item);
            
            System.out.println("Item cadastrado com sucesso !!");
            
            
        
        
        
        
        }
        System.out.println("Itens cadastrados");
        for (Item item : itens){
            System.out.println(item);
        }
        Scanner.close();
    }
}

















public class Item{
    private String nome;
    private double preco;
    private int quantidade; 
    
    
    
    public Item(String nome, double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public String getPreco(){
        return preco;
    }
    public String getQuantidade(){
        return quantidade;
    }
    
    @override 
    public String toString(){
        return "Item{"+ "Nome = "+ nome +"/"+"preco = "+preco+ "/"+ "Quantidade = "+ quantidade + "}";
    }
}
