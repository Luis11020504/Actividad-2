package MainApp; // Asumiendo que está en el mismo paquete

public class MainApp {
    
    
    // El método 'main' es el punto de inicio del programa
    public static void main(String[] args) {
        
        // Instanciación de objetos a partir de la clase Producto
        
        // 1. Crear el primer objeto (Llama al constructor)
        Producto laptop = new Producto("Laptop X100", 1200.50, 2);
        
        // 2. Crear un segundo objeto, independiente del primero
        Producto raton = new Producto("Mouse Inalámbrico", 15.00, 5);

        // Uso de Métodos: Interactuar con el objeto 'laptop'
        System.out.println("--- Usando el Objeto Laptop ---");
        laptop.mostrarInfo();
        
        double totalLaptop = laptop.calcularTotal();
        System.out.println("Costo Total de Laptops: $" + totalLaptop);

        System.out.println("\n--------------------------------");
        
        // Uso de Métodos: Interactuar con el objeto 'raton'
        System.out.println("--- Usando el Objeto Ratón ---");
        raton.mostrarInfo();
        
        double totalRaton = raton.calcularTotal();
        System.out.println("Costo Total de Ratones: $" + totalRaton);
        
        // Total general
        System.out.println("\n--------------------------------");
        System.out.println("GRAN TOTAL DE LA ORDEN: $" + (totalLaptop + totalRaton));
    }
}