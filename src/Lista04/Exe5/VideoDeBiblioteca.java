package Lista04.Exe5;

import java.util.ArrayList;

public class VideoDeBiblioteca extends ArquivoDeVideo implements ItemDeBiblioteca{

    public boolean disponivel;
    public ArrayList<String> emprestimos;
    public String categoria;

    public VideoDeBiblioteca(String titulo, float duracao, double tamanho, String categoria){
        super(titulo, duracao, tamanho);
        this.categoria = categoria;
        this.emprestimos = new ArrayList<String>();
        this.disponivel = true;
    }

    public boolean disponivel() {
        return disponivel;
    }


    public void realizarEmprestimo(String nomePessoa) {
        disponivel = false;
        emprestimos.add(nomePessoa);
    }

    public void devolucao(String nomePessoa) {
        disponivel = true;
        emprestimos.remove(nomePessoa);
    }

    @Override
    public String toString() {
        return super.toString() + "Disponive: " + disponivel + ", Categoria: " + categoria;
    }
}
