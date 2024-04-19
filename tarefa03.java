//Arquivo ainda não pronto, máquina não possui github para fazer commit

public class Endereco {
    public static void main(String[] args){

    }
}

enum TipoLogradouro{
    Alameda,
    Avenida,
    Marginal,
    Rua,
    Rodovia,
    Via, 
    Viela,
    Travessia
}

enum TipoEndereco{
    Comercial,
    Residencial
}

public class PessoaFisica{
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Endereco Endereco;

}

public class Bairro{
    private String nome;
    private Cidade cidade
}

public class Cidade{
    private String nome;
    private Estado estado
}