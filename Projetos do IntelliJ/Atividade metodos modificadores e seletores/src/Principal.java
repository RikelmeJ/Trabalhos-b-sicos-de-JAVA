import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("Carro 1");

        carro1.setTipo("");
        System.out.println("O carro é do tipo: " + carro1.getTipo());
        String a = scanner.next();

        carro1.setCor("");
        System.out.println("A cor do carro é: " + carro1.getCor());
        String b = scanner.next();

        carro1.setPlaca();
        System.out.println("Os códigos da placa: " + carro1.getPlaca());
        String c = scanner.next();

        carro1.setNumPortas();
        System.out.println("A quantidade de portas é: " + carro1.getNumPortas());
        int d = scanner.nextInt();

        carro1.setCombustivel("");
        System.out.println("O tipo de combustível ultilizado é: " + carro1.getCombustivel());
        double e = scanner.nextDouble();

        carro1.setPeso(0);
        System.out.println("O peso do carro é: " + carro1.getPeso());
        double f = scanner.nextDouble();

        carro1.setMarca("");
        System.out.println("A marca do carro é: " + carro1.getMarca());
        String g = scanner.next();

        carro1.setAnoFabricacao(2023);
        System.out.println("Seu ano de fabricação: " + carro1.getAnoFabricacao());
        int h = scanner.nextInt();

        carro1.descricaoCarro();




}
}



