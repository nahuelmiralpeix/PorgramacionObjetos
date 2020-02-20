package interfaces;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Camiseta camiseta = new Camiseta("Algodon", 1, "Micamiseta", "Azul", 20);
        String[] ingredientes = new String[]{"i1", "i2", "i3"};
        Pizza pizza = new Pizza(100, 100, 70, ingredientes, 7);
        Rosa rosa = new Rosa(1, "NOmbreRosa", Constantes.FAMILIA_UNO, "Amarillo", 12);
        Rosa rosa2 = new Rosa(1, "NOmbreRosa", Constantes.FAMILIA_DOS, "Amarillo", 12);
        empresa.registrarProducto(camiseta);
        empresa.registrarProducto(camiseta);
        empresa.registrarProducto(camiseta);
        empresa.registrarProducto(camiseta);
        empresa.registrarProducto(pizza);
        empresa.registrarProducto(pizza);
        empresa.registrarProducto(pizza);
        empresa.registrarProducto(rosa);
        // empresa.mostrarPreciosTotales();
        empresa.mostrarCosteAcumulado();
        pizza.calcularImpuesto();
        camiseta.calcularImpuesto();


    }

}
