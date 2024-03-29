package pkgaeropuerto.modelo;

import java.util.Objects;

public abstract class Vuelo implements Comparable<Vuelo> {
	private String destino;
	private String modelo;
	private int numplazas;
	
	
	public Vuelo(String destino, String modelo, int numplazas) {
		this.destino = destino;
		this.modelo = modelo;
		this.numplazas = numplazas;
	
	}


	
	/**
	 * @return el destino
	 */
	public String getDestino() {
		return destino;
	}


	/**
	 * @param destino el destino a establecer
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}


	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	/**
	 * @return el numplazas
	 */
	public int getNumplazas() {
		return numplazas;
	}


	/**
	 * @param numplazas el numplazas a establecer
	 */
	public void setNumplazas(int numplazas) {
		this.numplazas = numplazas;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(destino, other.destino) && Objects.equals(modelo, other.modelo)
				&& numplazas == other.numplazas;
	}


	@Override
	public int compareTo(Vuelo o) {
		return this.destino.compareTo(o.destino);
		
	}
	
	@Override
	public String toString() {
		return "\n-----------------\n\nDestino " + destino + "\nAvion:" + modelo + "\nPlazas:" + numplazas + "\n" + "\nPrecio billete: " + String.format("%.2f", this.calcularPrecioFinal()) + "�";
	}

	
	public int getNumeroPasajeros() {
		return numplazas;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double calcularPrecioFinal() {
		return precio;
	}
}

