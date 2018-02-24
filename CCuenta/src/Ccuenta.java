
public class Ccuenta {


	    // Atributos de cuenta
	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;



	    public Ccuenta (String nom, String cue, double sal, double tipo)
	    {
	        nombre=nom;
	        cuenta=cue;
	        saldo=sal;
	    }

	    public double getSaldo ()
	    {
	        return saldo;
	    }

	    //Para probar Junit
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("Cantidad negativa");
	        saldo = saldo + cantidad;
	    }



	    //Para probar JUnit
	    public void retirar (double cantidad) throws Exception
	    {
	        if (cantidad < 0)
	            throw new Exception ("Cantidad Negativa");
	        if (this.getSaldo()< cantidad)
	            throw new Exception ("Saldo insuficiente");
	        saldo = saldo - cantidad;
	    }

	    // M�todo que me devuelve el n�mero de cuenta
	    public String getCuenta ()
	    {
	        return cuenta;
	    }
	}
