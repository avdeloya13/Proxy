/**
 * Representa una interfaz para el patron de diseno
 * @author Ana Valeria Deloya Andrade
 * @version 1.0 
 */
public interface IProxy{

    /**
     * Obtiene el dinero de la cuenta
     * @return el dinero 
     */
    public double obtenerDinero();


    /**
     * Para depositar dinero a la cuenta
     * @param dinero dinero a depositar
     */
    public void depositarDinero(double dinero);


    /**
     * Para consultar saldo de la cuenta
     * @return un mensaje con el saldo 
     */
    public String consultarSaldo();

}

