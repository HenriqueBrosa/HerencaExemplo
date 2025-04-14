
public class Principal {
    
    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("area do triângulo:" + triangulo.getArea());

        Circulo circulo = new Circulo("Branco",3);
        System.out.println(circulo.paraString());
        circulo.imprimir();
    }
}
