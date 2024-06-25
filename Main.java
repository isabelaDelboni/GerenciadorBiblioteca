public class Main {
    public static void main(String[] args) {
        
        Livraria livraria = new Livraria();
        Inputs inputs = new Inputs();
        CriadorDeIdUnico criadorDeIdUnico = new CriadorDeIdUnico();
        Menu menu = new Menu(livraria, inputs, criadorDeIdUnico);
        menu.exibirMenuPrincipal();
    }
}
