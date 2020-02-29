package com.EvaluacionPoo.Pedro;

public class Electrodomestico {
	//Declaracion de Constantes
	protected final static String COLOR_DEFECTO = "blanco";
	protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
    protected final static double PRECIO_BASE_DEFECTO = 100;
    protected final static int PESO_DEFECTO = 5;
    
    //Declaracion de Variables
    protected double precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	
	//Metodos Set y Get
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	//Metodos Constructores
	public Electrodomestico() {
		this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
	}
	
	public Electrodomestico(double precioBase, int peso) {

	   this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
		
	}
	//
	public Electrodomestico(double precioBase, int peso, String color, char consumoEnergetico ) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
	    comprobarColor(color);
	}
	public Electrodomestico(double precioBaseDefecto, int pesoDefecto, char consumoEnergeticoDefecto,
			String colorDefecto) {
		
	}
	//Metodo para comprobar el Consumo Energetico. Listo
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		
		if(consumoEnergetico == 'A'||consumoEnergetico == 'B'||consumoEnergetico == 'C'||consumoEnergetico == 'D'||consumoEnergetico == 'E'||consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}	
	}
	
	//Metodo para comprobar el Color. Lista
	 public void comprobarColor(String miColor) {
		
	        String colores[]={"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	        boolean colorEncontrado = false;
	  
	        for(int i=0;i<colores.length && !colorEncontrado;i++){
	            if(colores[i].equalsIgnoreCase(miColor)){
	                colorEncontrado=true;
	            }  
	        }
	        if(colorEncontrado){
	            this.color = miColor;
	        }else{
	            this.color=COLOR_DEFECTO;
	        }
	 }
		 
	 //Metodo para Calcular el Precio Final
	 public double precioFinal(){
	        double subTotal = 0;
	        
	        switch(consumoEnergetico){
	            case 'A':
	                subTotal += 100;
	                break;
	            case 'B':
	                subTotal += 80;
	                break;
	            case 'C':
	                subTotal += 60;
	                break;
	            case 'D':
	                subTotal += 50;
	                break;
	            case 'E':
	                subTotal += 30;
	                break;
	            case 'F':
	                subTotal += 10;
	                break;
	        }
	   
	        if(peso >= 0 && peso < 19){
	            subTotal += 10;
	        }else if( peso >= 20 && peso < 49){
	            subTotal += 50;
	        }else if(peso >= 50 && peso <= 79){
	            subTotal += 80;
	        }else if(peso >= 80){
	            subTotal += 100;
	        }
	   
	        return  precioBase + subTotal;
	        
	        
	    }
	
}
