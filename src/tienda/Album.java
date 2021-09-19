
package tienda;

public class Album extends Producto {
		
    public String numCanciones;
    
    public Album(String nombre, String autor, String precio, String genero, String numCanciones) {
        super(nombre, autor, precio, genero);
        this.numCanciones = numCanciones;
    }

    @Override
    public String toString() {
        String info = "";
        //info += "***Tienda MisionTicFY***" + "\n";
        info += "\tÁlbum - nombre: " + this.nombre;
        info += "\n" + "\tautor: " + this.autor;
        info += "\n\tprecio: " + this.precio;
        info += "\n\tgénero: " + this.genero;
        info += "\n\tcanciones: " + this.numCanciones+ "\n";
        return info;
    }

    
}
