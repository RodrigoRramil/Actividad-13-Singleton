package conexionBBDD;

public class Programa {

    public static void main(String[] args) {
        
    	ConexionBBDD juan = ConexionBBDD.getSingletonInstance("juanadmin");
    	ConexionBBDD rodrigo = ConexionBBDD.getSingletonInstance("rodrigoadmin");
        
        // juan y rodrigo son referencias a un único objeto de la clase ConexionBBDD
    	System.out.println("referencia_1 :" + juan.getUsuario());   
        System.out.println("referencia_2 :" + rodrigo.getUsuario());
    }
}