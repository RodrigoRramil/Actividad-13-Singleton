package conexionBBDD;

public class ConexionBBDD {
	
	private String driver;
	private static String url;
	private String usuario;
	private static ConexionBBDD clave; 
	
    // El constructor es ámbito privado, no permite que se genere un constructor por defecto.
    private ConexionBBDD(String usuario) {
        this.setUsuario(usuario);
        System.out.println("Mi usuario es: " + this.getUsuario());
    }
    // Método publico de la clase, que solo se puede utilizar si no hay ninguna instance de la clase creada
    public static ConexionBBDD getSingletonInstance(String usuario) {
        if (getClave() == null){
        	setClave(new ConexionBBDD(usuario));
        }
        else{
            System.out.println("No se puede crear el objeto "+ usuario + " porque ya existe un objeto de la clase ConexionBBDD");
        }
        
        return getClave();
    }
    
    // metodos getter y setter
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public static ConexionBBDD getClave() {
		return clave;
	}

	public static void setClave(ConexionBBDD clave) {
		ConexionBBDD.clave = clave;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		ConexionBBDD.url = url;
	}
    
}