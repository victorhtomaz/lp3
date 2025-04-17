package Lista04.Exe5;

public class ArquivoDeVideo {
    public String titulo;
    public float duracao;
    public double tamanhoDoArquivo;
    public String categoria;

    public ArquivoDeVideo(String titulo, float duracao, double tamanho){
        this.titulo = titulo;
        this.duracao = duracao;
        this.tamanhoDoArquivo = tamanho;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Duracao:" + duracao + ", TamanhoDoArquivo: " + tamanhoDoArquivo + ", Categoria: " + categoria;
    }
}