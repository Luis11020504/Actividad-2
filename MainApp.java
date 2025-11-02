package MainApp;


public class MainApp {
    public static void main(String[] args) {

        Producto raton = new Producto("Mouse Inalámbrico", 15.00, 5);
        raton.mostrarInfo(); // Muestra nombre, precio y cantidad
        System.out.println("Costo Total de Ratones: $" + raton.calcularTotal());

        System.out.println("\n-----------------------------");

     
        ProductoElectronico laptop = new ProductoElectronico("Laptop X100", 1200.50, 2, 24);
        laptop.mostrarInfo(); // Muestra nombre, precio, cantidad y garantía
        System.out.println("Costo Total de Laptops: $" + laptop.calcularTotal());

        System.out.println("\n-----------------------------");

       
        System.out.println("GRAN TOTAL DE LA ORDEN: $" + (raton.calcularTotal() + laptop.calcularTotal()));
    }
}
