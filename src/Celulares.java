
public class Celulares {
	private String marca;
	private String gama;
	private float precio;
	private int stock;
	
	public Celulares(String marca, String gama, float precio, int stock) {
		this.marca = marca;
		this.gama = gama;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Celulares [marca=" + marca + ", gama=" + gama + ", precio=" + precio + ", stock=" + stock + "\n]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	
}
