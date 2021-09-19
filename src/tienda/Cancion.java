package tienda;

public class Cancion extends Producto {
	
    String duracion;
    
    public Cancion(String nombre, String autor, String precio, String genero, String duracion) {
	super(nombre, autor, precio, genero);
	this.duracion = duracion;
    }

    @Override
    public String toString() {
        String info = "";
        //info += "***Tienda MisionTicFY***" + "\n";
        info += "\tCanción - nombre: " + this.nombre;
        info += "\n" + "\tautor: " + this.autor;
        info += "\n\tprecio: " + this.precio;
        info += "\n\tgénero: " + this.genero;
        info += "\n\tduración: " + duracion + "\n";
        return info;
    }
    	

}
