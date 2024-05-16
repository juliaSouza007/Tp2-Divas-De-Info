public class Biblioteca {

    Livro[] livro = new Livro[8000];
    Usuarios[] usuarios = new Usuarios[4000];
    Morador[] morador = new Morador[1000];
    Aluno[] aluno = new Aluno[2000];
    Professor[] professor = new Professor[1000];
    int idAtual;
    int usuarioAtual;

    public void realizarDevolucao() {
    }

    public void realizarEmprestimo() {
    }

    public void imprimirLivros() {
        idAtual = Livro.id;
        System.out.println("<< IMPRIMINDO CATALOGO >>\n");
        for (int i = 0; i < idAtual; i++) {
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

    public void cadastrarUsuario () {
        System.out.println("<< CADASTRANDO USUARIOS >>\n");

        //Moradores
        usuarioAtual = Usuarios.id;
        morador[usuarioAtual] = new Morador("Joaozinho das Couves", "123.456.789-00");

        usuarioAtual = Usuarios.id;
        morador[usuarioAtual] = new Morador("Cleusa das Quitandas", "174.486.799-10");

        usuarioAtual = Usuarios.id;
        morador[usuarioAtual] = new Morador("Marta das Frutas", "321.765.779-09");

        //Alunos
        usuarioAtual = Usuarios.id;
        aluno[usuarioAtual] = new Aluno("Heitor de Sousa", "143.226.939-87", "COLTEC");

        usuarioAtual = Usuarios.id;
        aluno[usuarioAtual] = new Aluno("Ana Julia Ferreira", "273.398.287-65", "COLTEC");

        usuarioAtual = Usuarios.id;
        aluno[usuarioAtual] = new Aluno("Isadora Ramos", "179.826.654-54", "COLTEC");

        usuarioAtual = Usuarios.id;
        aluno[usuarioAtual] = new Aluno("Julia Souza", "917.612.525-52", "COLTEC");

        //Professores
        usuarioAtual = Usuarios.id;
        professor[usuarioAtual] = new Professor("Joao Montandon", "998.917.846.66", "Ciencia da Computacao");

        usuarioAtual = Usuarios.id;
        professor[usuarioAtual] = new Professor("Marcio Fantini", "916.512.534-63", "Fisica");

        usuarioAtual = Usuarios.id;
        professor[usuarioAtual] = new Professor("Humberto Honda", "327.928.172-62", "Engenharia Eletrica");

        usuarioAtual = Usuarios.id;
        professor[usuarioAtual] = new Professor("Virginia Mota", "521.825.251-55", "Ciencia da Computacao");

        usuarioAtual = Usuarios.id;
        professor[usuarioAtual] = new Professor("Leandro Maia", "392.261.353.22", "Ciencia da Computacao");

        System.out.println("<< USUARIOS CADASTRADOS COM SUCESSO >>\n");
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("<<BIBLIOTECA JAHI>>\n");

        biblioteca.cadastrarLivro();
        biblioteca.cadastrarUsuario();
        biblioteca.imprimirLivros();
    }
}