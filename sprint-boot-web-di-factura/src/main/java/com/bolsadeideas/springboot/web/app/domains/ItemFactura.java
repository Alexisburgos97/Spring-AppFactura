package com.bolsadeideas.springboot.web.app.domains;

public class ItemFactura {
	private int cantidad;
	private Producto producto;
	
	public ItemFactura(Producto producto, int cantidad) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public double calcularImporte() {
		return cantidad*producto.getPrecio();
	}
	

}
