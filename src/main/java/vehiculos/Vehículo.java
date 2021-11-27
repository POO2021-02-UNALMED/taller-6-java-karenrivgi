package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Vehículo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	private static Map<Pais, Integer> ventasPorPais = new HashMap <Pais, Integer>();
	private static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();
	
	public Vehículo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		ventasPorPais.put(fabricante.getPais(), ventasPorPais.get(fabricante.getPais()) + 1);
		ventasPorFabrica.put(fabricante, ventasPorFabrica.get(fabricante) + 1);
		Vehículo.cantidadVehiculos++;
		
	}
	
	public static Pais paisMasVendedor()
	{
		int valorMax = -1;
		Pais paisMasVendedor = null;

		for (Entry<Pais, Integer> entry : ventasPorPais.entrySet()) {
		    final int valorActual = entry.getValue();

		    if (valorActual > valorMax) 
		    {
		    	valorMax = valorActual;
		    	paisMasVendedor = entry.getKey();
		    } 	   
		}
		
		return paisMasVendedor;
	}
	
	public static Fabricante fabricaMayorVentas()
	{
		int valorMax = -1;
		Fabricante fabricaMayorVentas = null;

		for (Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()) {
		    final int valorActual = entry.getValue();

		    if (valorActual > valorMax) 
		    {
		    	valorMax = valorActual;
		    	fabricaMayorVentas = entry.getKey();
		    } 	   
		}
		
		return fabricaMayorVentas;
	}

	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehículo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo()
	{
		return "Automoviles: " + Automovil.getCantidadAutomoviles()+
				"\nCamionetas: " + Camioneta.getCantidadCamionetas() +
				"\nCamiones: " + Camion.getCantidadCamiones();
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
