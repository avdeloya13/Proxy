import java.util.Scanner;

/**
 * Representa clase Proxy
 * @author Ana Valeria Deloya Andrade
 * @version 1.0 
 */
public class Proxy implements IProxy{
    //Cuenta a manejar
    private Cuenta cuenta;


    /**
     * Constructor de la clase Proxy
     */   
    public Proxy(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public double obtenerDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de cuenta:");
        int noCuenta = sc.nextInt();
        System.out.println("Introduzca el numero de contrato:");
        int contrato = sc.nextInt();

        if( (noCuenta == cuenta.getNoCuenta()) && (contrato == cuenta.getContra()) )
            return cuenta.obtenerDinero();
        //La verificacion no fue valida
        return 0.0;
    }
    

    @Override
    public void depositarDinero(double dinero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de cuenta:");
        int noCuenta = sc.nextInt();
        System.out.println("Introduzca el numero de contrato:");
        int contrato = sc.nextInt();

        if((noCuenta == cuenta.getNoCuenta()) && (contrato == cuenta.getContra()))
            cuenta.depositarDinero(dinero);          
    }


    @Override
    public String consultarSaldo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de cuenta:");
        int noCuenta = sc.nextInt();
        System.out.println("Introduzca el numero de contrato:");
        int contrato = sc.nextInt();

        if((noCuenta == cuenta.getNoCuenta()) && (contrato == cuenta.getContra()))
            return cuenta.consultarSaldo();
        return "Datos invalidos, no podemos darle un saldo";
    }
}
