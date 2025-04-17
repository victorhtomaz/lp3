package Lista04.Exe6;
import Lista04.Exe5.*;

public class Biblioteca {
    public static void main(String[] args){
        ArquivoDeVideo arquivo = new ArquivoDeVideo("Java OOP", 2.5f, 500);
        System.out.println(arquivo.toString());

        VideoDeBiblioteca video = new VideoDeBiblioteca("Java Pratico", 3, 700, "Programação");

        System.out.println(video.toString());
        System.out.println(video.disponivel());

        if (video.disponivel()){
            video.realizarEmprestimo("Carlos");
            System.out.println(video.disponivel());
            System.out.println(video.emprestimos.toString());
            video.devolucao("Carlos");
            System.out.println(video.disponivel());
            System.out.println(video.emprestimos.toString());
        }



    }
}
