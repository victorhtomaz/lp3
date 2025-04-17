package Lista04.Exe5;

public interface ItemDeBiblioteca {
    boolean disponivel();
    void devolucao(String nomePessoa);

    void realizarEmprestimo(String nomePessoa);
}
