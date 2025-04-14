import javax.swing.JOptionPane;

public class Circulo extends FiguraGeometrica {
    
    private double raio;
    public Circulo() {
        this("",0);
    }
    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }
    public double getRaio() {
        return raio;
    }
        /**
         * Método modificador da Raio.
         * Recebe uma altura como parâmetro para modificar o Raio do Circulo.
         * @param raio Double.
         */
        public void setRaio(double raio) {
        this.raio = raio;
    }
        /**
         * Método modificador da Raio.
         * Recebe uma altura como parâmetro para modificar o Raio do Circulo
         * @param raio Uma String para ser convertida para double.
         */
        public void setRaio(String raio) {
        this.raio = Double.parseDouble(raio);
    }
    
    @Override
    public void leitura() {
        super.leitura();
        setRaio (JOptionPane.showInputDialog("Digite o raio"));
    }
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O raio é " + getRaio());
    }
    @Override
    public String paraString() {
        return (super.paraString() + "/ Raio : " + getRaio());
    }
    public double getArea() {
        return (Math.PI * getRaio() * getRaio());
    }
}
