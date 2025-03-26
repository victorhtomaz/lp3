package Lista02;

public class Concessionaria {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Carlos", 1231231237);
        Cliente cliente2 = new Cliente("Joao", 1231231236, 217354694);

        Veiculo veiculo1 = new Veiculo(4, "Gasolina", "Wolksvagem", "Fusca", 1980);
        Veiculo veiculo2 = new Veiculo(4, "Gasolina", "Fiat", "Uno", 1995, "21");

        veiculo1.venda(cliente2);
        veiculo2.venda(cliente1);

        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
