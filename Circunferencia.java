public class Circunferencia {
    private double raio;

    public Circunferencia(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.1415 * raio;
    }

    public double calcularArea() {
        return 3.1415 * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(5);

        System.out.println("Raio: " + circunferencia.getRaio());
        System.out.println("Perímetro (Circunferência): " + circunferencia.calcularPerimetro());
        System.out.println("Área: " + circunferencia.calcularArea());
    }
}
