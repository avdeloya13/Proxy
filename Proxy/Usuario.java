/**
 * Representa a un Usuario 
 * @author Ana Valeria Deloya Andrade
 * @version 1.0 
 */
public class Usuario{

    //Cuenta a manejar
    public static Cuenta c = new Cuenta(12345, 7894, 100);

    //Metodos totalmente diferentes a los de la interfaz

    /**
     * Obtiene el dinero del usuario
     * @return el dinero del usuario
     */
    public static double obtenerDinero(){
        //Le pasamaos la cuenta a manejar
        IProxy p = new Proxy(c);
        //Proxy se va encargar de manejar la seguridad, la peticion
        return p.obtenerDinero();
    }


    /**
     * Para que el usuario deposite dinero
     * @param dinero dinero a depositar
     */
    public static void depositarDinero(double dinero){
        IProxy p = new Proxy(c);
        p.depositarDinero(dinero);

    }

    
    /**
     * Para que el usuario consulte su saldo
     * @return un mensaje con el saldo 
     */
    public static String consultarSaldo(){
        IProxy p = new Proxy(c);
        return p.consultarSaldo(); 
    }


    public static void main(String[] args) {
        System.out.println(Usuario.consultarSaldo());        
    }  
}
