package Macedo.Henrique.Exemplo.RestController.HelloWorld.Model;

/**
 * @author Henrique Macedo
 * @since 15/04/2020 7:27PM
 * @version 1.0
 */
public class Client {
    private String nome;
    private int idade;

    public Client(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Client() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
