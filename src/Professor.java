public class Professor extends Usuarios{

    private String formacao;

    Professor(String formacao){
        this.formacao = formacao;
        this.livrosAlugados = new Livro[10];
    }

}
