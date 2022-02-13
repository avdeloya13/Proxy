/**
 * Clase que representa una cuenta bancaria
 * @author Ana Valeria Deloya Andrade
 * @version 1.0 
 */
public class Cuenta implements IProxy{
   
    private int NoCuenta;
    private int contra;
    private double dinero;


    /**
     * Constructor de la clase Cuenta
     */
    public Cuenta(int NoCuenta, int contra, double dinero) {
        this.NoCuenta = NoCuenta;
        this.contra = contra;
        this.dinero = dinero;
    }


    @Override
    public double obtenerDinero(){
        return this.dinero;
    }


    @Override
    public void depositarDinero(double dinero) {
        this.dinero += dinero;
    }


    @Override
    public String consultarSaldo() {
        return String.valueOf(this.dinero);
       //return "" + this.dinero;
    }


    /**
     * Obtiene el numero de cuenta
     * @return el numero de cuenta
     */
    public int getNoCuenta() {
        return NoCuenta;
    }


    /**
     * Modifica el numero de cuenta
     * @param el numero de cuenta nuevo
     */
    public void setNoCuenta(int noCuenta) {
        NoCuenta = noCuenta;
    }


    /**
     * Obtiene la contrasena
     * @return la contrasena
     */
    public int getContra() {
        return contra;
    }


    /**
     * Modifica la contrasena
     * @param la contrasena nueva
     */
    public void setContra(int contra) {
        this.contra = contra;
    }


    /**
     * Obtiene el dinero de la cuenta
     * @return el dinero de la cuenta
     */
    public double getDinero() {
        return dinero;
    }


    /**
     * Modifica el dinero de la cuenta
     * @param dinero la nueva cantidad de dinero
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}
