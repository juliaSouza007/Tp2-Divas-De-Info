public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    public static int id = 0;

    Livro(String titulo, String autor, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.id++;
    }


    String getTitulo() {
        return this.titulo;
    }
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    String getAutor() {
        return this.autor;
    }
    void setAutor(String autor) {
        this.autor = autor;
    }

    String getEditora() {
        return this.editora;
    }
    void setEditora(String editora) {
        this.editora = editora;
    }

    int getAnoPublicacao() {
        return this.anoPublicacao;
    }
    void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    int getId() {
        return this.id;
    }

    /*void setId(int id) {
        this.id = id;
    }*/

    void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de Publicação: " + anoPublicacao + "\n");
    }
}
