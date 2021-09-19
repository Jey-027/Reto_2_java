
package tienda;


public abstract class Producto {
	String nombre;
	String autor;
	String precio;
	String genero;
	
	public Producto(String nombre, String autor, String precio, String genero) {
            this.nombre = nombre;
            this.autor = autor;
            this.precio = precio;
            this.genero = genero;
	}
	
	
}