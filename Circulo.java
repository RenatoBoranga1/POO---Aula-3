public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Diâmetro: " + circulo.getDiametro());
        System.out.println("Perímetro: " + circulo.getPerimetro());
    }
}
