package problema;

import solucao.Pessoa;
import solucao.PessoaBuilder;

public class TestePessoaComBuilder {
    public static void main(String[] args){
        Pessoa pessoa =
        new PessoaBuilder().nome("Anderson")
                .sobreNome("Piotto")
                .documento("400289224002")
                .email("piotto10@gmail.com")
                .apelido("careca")
                .dataDoNascimento("12/03/1985")
                .criaPessoa();
        System.out.println(pessoa);
    }
}
