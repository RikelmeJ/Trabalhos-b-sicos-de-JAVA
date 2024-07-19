public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPortas;
    String combustivel;
    double peso;
    String marca;
    int anoFabricacao;


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    String getPlaca() {
        return placa;
    }

    void setPlaca() {
        this.placa = "RAJBV-9078";
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas() {
        this.numPortas = numPortas;
    }

    void setCor(String cor) {
        this.cor= cor;

   }
   String getCor(){
        return  this.cor;
    }

    public String getTipo() {
        return tipo;


    }
    public void DescricaoDoCarro(){
        System.out.println("O modelo do carro é:" + tipo);
        System.out.println("A cor do carro é " + cor);
        System.out.println("A placa do carro é" + placa);
        System.out.println("A quantidade de portas é :" + numPortas);
    }

    public void descricaoCarro() {
    }

    public void setNumPortas(int i) {
    }
}
