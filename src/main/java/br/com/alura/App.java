package br.com.alura;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Produto produto = new Produto("Bala juquinha sabor tangerina",0.15);
        System.out.println( "O nome do produto é " +produto.getNome()+ " e que custa "+ produto.getPreco() );
        //System.out.println( "Hello World!" );
    }
}
