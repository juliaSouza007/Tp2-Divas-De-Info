public class Aluno extends Usuarios{

    private String escola;

    Aluno(String escola){
        this.escola =escola;
        this.livrosAlugados = new Livro[5];
    }

}
