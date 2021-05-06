package dominio;

import java.util.Date;

public class Debito extends Tarjeta
{
	public Debito(String numero, String titular, Date fechaCaducidad)
	{
		super(numero, titular, fechaCaducidad);
	}
	
	public void retirar(double x) throws Exception 
	{
		this.mCuentaAsociada.retirar("Retirada en cajero automatico", x);
	}
	
	//En el método ingresar había un fallo, ponía retirar en lugar ingresar de la cuenta asociada
	public void ingresar(double x) throws Exception 
	{
		this.mCuentaAsociada.ingresar("Ingreso en cajero automatico", x);
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception 
	{
		this.mCuentaAsociada.retirar("Compra en :" + datos, x);
	}
	
	public double getSaldo() 
	{
		return mCuentaAsociada.getSaldo();
	}
}