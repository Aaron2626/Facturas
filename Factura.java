public class Factura implements IFactura{

	private int num;
	private float base;
	private float tipoIva;
	private Estados estado;

	public void cambiarEstado(Estados estado){}
	public float getTotal(){
		return  this.base*this..tipoIva;
	}
	public float getCantidadIva(){
		return this,tipoIva; 
	}
}
