import javax.swing.JOptionPane;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;
    
    public Triangulo() {
        this("",0,0);
    }
    public Triangulo(String cor, double base, double altura){
        super(cor);
        setBase(base);
        setAltura(altura);
    }
    public double getBase() { return base; }
    
    
    /**
         * Método modificador da altura.
         * Recebe uma altura como parâmetro para modificar a altura do triângulo.
         * @param raio Double.
         */
    public void setBase(double base) { this.base = base; }
    
    /**
         * Método modificador da base.
         * Recebe uma altura como parâmetro para modificar a base do triângulo.
         * @param raio Uma String para ser convertida para double.
         */
    public void setBase(String base) { 
        this.base = Double.parseDouble(base); 
    }
    
    public double getAltura() { return altura; }
    
    /**
         * Método modificador da altura.
         * Recebe uma altura como parâmetro para modificar a altura do triângulo.
         * @param raio Double.
         */
    public void setAltura(double altura) { 
        this.altura = altura; 
    }
    /**
         * Método modificador da Altura.
         * Recebe uma altura como parâmetro para modificar a altura do triângulo.
         * @param raio Uma String para ser convertida para double.
         */
    public void setAltura(String altura) { 
        this.altura = Double.parseDouble(altura); 
    }
    
    public void leitura() {
        super.leitura();
        setBase (JOptionPane.showInputDialog("Digite a base"));
        setAltura (JOptionPane.showInputDialog("Digite a altura"));
    }
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null,"A base é " + getBase());
        JOptionPane.showMessageDialog(null,"A Altura é " + getAltura());
    }
    public String paraString() {
        return (super.paraString() + "/ Base : " + getBase() + "/ Altura :" + getAltura());
    }
    public double getArea() {
        return ((getBase() * getAltura())/2.0);
    }
}
