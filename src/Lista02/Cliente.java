package Lista02;

public class Cliente {
    private String nome;
    private long CPF;
    private long telefone;
    private long celular;
    public Cliente(String nome, long CPF){
        this.nome = nome;
        this.CPF = éValido(CPF);
    }
    public Cliente(String nome, long CPF, long telefone){
        this(nome, CPF);
        this.telefone = telefone;
    }
    public Cliente(String nome, long CPF, long telefone, long celular){
        this(nome, CPF, telefone);
        this.celular = celular;
    }
    private long éValido(long cpf){
        if (cpf % 2 == 0)
            return cpf;

        return 0;
    }
    public long getCPF(){
        return this.CPF;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + CPF + ", Telefone: " + telefone + ", Celular: " + celular;
    }
}
