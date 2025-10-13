/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApp;

// Archivo: Producto.java
// ...
public class Producto {

    private final String nombre;
    // ... (atributos)
    private final double precio;
    private final int cantidad;

    // Constructor Corregido: SOLO DEBE INICIALIZAR ATRIBUTOS
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre; // Esto probablemente está en la línea 14
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // ... (métodos)

    public void mostrarInfo() {
    // Es muy probable que la línea 26 sea la que sigue y que DEBE contener:
    System.out.println("Producto: " + nombre + 
                       ", Precio: $" + precio + 
                       ", Cantidad: " + cantidad);
    }

  public double calcularTotal() { // La firma debe ser exactamente esta
    return precio * cantidad;
}
}