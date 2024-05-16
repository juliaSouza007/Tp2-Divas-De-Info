import java.util.Scanner;

public class Biblioteca {

    Livro[] livro = new Livro[8000];
    Usuarios[] usuarios = new Usuarios[1000];
    int idAtual;

    public void devolverLivro() {
    }

    public void pegarLivro() {
    }

    public void imprimirLivros() {
        int idAtual = Livro.id;
        System.out.println("<< IMPRIMINDO CATALOGO >>\n");
        for (int i = 0; i < Livro.id; i++) {
            livro[i].imprimir();
        }
    }

    public void cadastrarLivro () {
        System.out.println("Cadastrando novos livros");

        // LAZER
        idAtual = Livro.id;
        livro[idAtual] = new Livro("Percy Jackson e O Ladrao de Raios", "Rick Riordan", "Intrinesca", 2005);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Percy Jackson e O Mar de Monstros", "Rick Riordan", "Intrinesca", 2006);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Percy Jackson e A Maldicao do Tita", "Rick Riordan", "Intrinesca", 2007);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Percy Jackson e A Batalha do Labririnto", "Rick Riordan", "Intrinesca", 2008);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Percy Jackson e O Ultimo Olimpiano", "Rick Riordan", "Intrinesca", 2009);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Se nao sou eu, quem vai fazer voce feliz", "Graziela Goncalves", "Paralela", 2018);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Beyonce Songbook", "Beyonce", "Hal Leonard", 2015);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Harry Potter: A serie completa", "J.K. Rowling", "ROCCO", 1998);

        // ESTUDOS
        idAtual = Livro.id;
        livro[idAtual] = new Livro("A Ditadura Envergonhada", "Elio Gaspari", "Intrinesca", 2002);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("A Ditadura Escancarada", "Elio Gaspari", "Intrinesca", 2002);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("O Povo Brasileiro", "Darcy Ribeiro", "Global", 1995);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Raizes do Brasil", "Sergio Buarque", "Jose Olympio", 1936);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("O Animal Social", "Elliot Aronson", "Goyo", 1972);

        idAtual = Livro.id;
        livro[idAtual] = new Livro("Nacao Dopamina", "Anna Lembke", "Vestigioz", 2021);

        System.out.println("Livros Cadastrados com sucesso!");
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("<<BIBLIOTECA JAHI>>\n");

        biblioteca.cadastrarLivro();
        biblioteca.imprimirLivros();
    }
}