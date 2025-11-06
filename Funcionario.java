public class funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String data_de_nascimento;

    public funcionario(String nome, String cpf, String salario, double data_de_nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Tipo: Funcionario| Nome; " + nome + " | CPF: " + cpf + "| Salario base: " + salario + "| Data de nascimento: " +data_de_nascimento;

    }

}