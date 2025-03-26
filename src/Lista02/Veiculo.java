package Lista02;

public class Veiculo {
    private static int contador;
    private int nSerie;
    private int nRodas;
    private String tipoCombustivel;
    private String marca;
    private String modelo;
    private int ano;
    private String chassi;
    private long proprietário;
    public Veiculo(int nRodas, String tipoCombustivel, String marca, String modelo, int ano){
        this.nSerie = ++contador;
        this.nRodas = nRodas;
        this.tipoCombustivel = tipoCombustivel;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public Veiculo(int nRodas, String tipoCombustivel, String marca, String modelo, int ano, String chassi){
        this(nRodas, tipoCombustivel, marca, modelo, ano);
        this.chassi = chassi;
    }
    public void venda(Cliente cliente){
        this.proprietário = cliente.getCPF();
    }
    @Override
    public String toString() {
        return "Serie: " + nSerie + ", Rodas:" + nRodas + ", Combustivel: " + tipoCombustivel
                + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Chassi: " + chassi
                + ", Proprietário: " + proprietário;
    }
}