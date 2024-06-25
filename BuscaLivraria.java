import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaLivraria extends GerenciadorLivros implements Busca<Livro> {

    private List<Livro> livros;

    

    public BuscaLivraria() {
        this.livros = livros;
    }

    @Override
    public void buscaPorNome(Scanner leitor) {
        System.out.print("Qual o título do livro que deseja buscar? ");
        String t = leitor.nextLine();

        for(int i = 0; i < livros.size(); i++){
            if (livros.get(i).getTitulo().equalsIgnoreCase(t)){
                listar(leitor); 
            } else {
                System.out.print("Livro não encontrada.");
            }
        }    
    }


    @Override
    public boolean buscaPorId(int id) {
        boolean verificador;
        Scanner i =  new Scanner(System.in);
        System.out.print("Qual o ID do livro que deseja pesquisar? ");
        int k = i.nextInt();

        for(int j = 1; j < livros.size(); j++){
            if (j == k){
                listar(i);
            } else {
                System.out.print("Livro não encontrado.");
            }
        }  
        return verificador = true;
    }
}
