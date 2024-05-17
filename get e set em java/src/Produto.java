/*
    Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
    e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */

public class Produto {
    private String nome;
    private double preco;
    double precoFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int percentualDesconto)
    {
        precoFinal = preco - (preco * ((double) percentualDesconto/100));
        System.out.println(precoFinal);
    }
}
