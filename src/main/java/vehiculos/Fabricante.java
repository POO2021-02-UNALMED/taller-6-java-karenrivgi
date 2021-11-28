package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;	
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

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
