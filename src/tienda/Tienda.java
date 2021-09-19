package tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tienda {

    //public static String save;
    public static ArrayList<String> producto = new ArrayList<>();
    public static String resultfinal = "";

    public static void guardaDatos(String save) {
        String result = save.replaceAll("\\s", "");
        Collections.addAll(producto, save.split("&"));

    }

    public static void mostrarDatos() {
        //System.out.println("***Tienda MisionTicFY***");
        resultfinal += "***Tienda MisiónTicFY***" + "\n";
        
        		
        for(int i=0; i < producto.size(); i++) {
            if(producto.get(i).equalsIgnoreCase("Álbum")){
                ++i;    
                Album newAlbum = new Album(producto.get(i++), producto.get(i++), producto.get(i++), producto.get(i++), producto.get(i++));
                //System.out.println(newAlbum);
                resultfinal += newAlbum;
                //++i; 
            }else if(producto.get(i).equalsIgnoreCase("Canción")) {
                ++i;
                Cancion newCancion = new Cancion(producto.get(i++), producto.get(i++), producto.get(i++), producto.get(i++), producto.get(i++));
            	//System.out.println(newCancion);
                resultfinal += newCancion;
                        //++i;
                        }
        	}
        	//j+=6;


        //}
        System.out.println(resultfinal);
        resultfinal = "";
        
    }
        

    public static void pedirDatos() {
        try {
            Scanner ent = new Scanner(System.in);
            while (true) {
                //save = JOptionPane.showInputDialog("Ingrese una opcion: ");
                //Scanner ent = new Scanner(System.in);
                //System.out.println("enter option");
                String save = ent.nextLine();
                
                

                if (save.charAt(0) == '1') {
                    guardaDatos(save);
                   

                } else if (save.charAt(0) == '2') {
                    mostrarDatos();


                } else if (save.charAt(0) == '3') {
                    //mostrarDatos();
                    break;

                }

            }

        } catch (Exception e) {
            //System.err.println("opcion incorrecta");
            //pedirDatos();

        }

    }

    public static void main(String[] args) {

        pedirDatos();
        
        //System.out.println(resultfinal);

    }

}
