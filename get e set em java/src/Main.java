public class Main {
    public static void main(String[] args)
    {
        // 1 - Conta Bancária
        System.out.println("Informações bancárias.");
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setTitular("Luiz Fernando");
        minhaConta.setNumeroConta(1234);
        minhaConta.setSaldo(650.89);
        System.out.println(minhaConta.getTitular());
        System.out.println(minhaConta.getNumeroConta());
        System.out.println(minhaConta.getSaldo());
        System.out.println();

        // 2 - Idade Pessoa
        System.out.println("Verifica se a pessoa é maior de idade ou não.");
        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setNome("Luiz Fernando");
        pessoa1.setIdade(25);
        System.out.print(pessoa1.getNome() + " é ");
        pessoa1.verificarIdade();
        System.out.println();

        // 3 - Produto
        System.out.println("Verifica preço final do produto depois do desconto.");
        Produto produto1 = new Produto();
        produto1.setNome("Tênis");
        produto1.setPreco(150);
        produto1.aplicarDesconto(27);
        System.out.println();

        // 4 - Aluno
        System.out.println("Calcula a média das notas do aluno.");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Luiz Fernando");
        aluno1.setNotas(10);
        aluno1.setNotas(8);
        System.out.println(aluno1.calcularMedia());
        System.out.println();

        // 5 - Livro
        System.out.println("Mostra detalhes sobre o livro.");
        Livro livro1 = new Livro();
        livro1.setTitulo("Gatos de Botas");
        livro1.setAutor("Charles Perrault");
        livro1.exibirDetalhes();;


    }
}