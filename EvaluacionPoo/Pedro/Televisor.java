package com.EvaluacionPoo.Pedro;

public class Televisor extends Electrodomestico{
	 
    private final static int RESOLUCION_DEFECTO = 20;
    private int resolucion;
    private boolean sintonizadorTDT;
	
    
    public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		
		this.sintonizadorTDT = sintonizadorTDT;
	}
	//Metodos Constructores
	public Televisor(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, false);
    }
  
    public Televisor(double precioBase, int peso){
    	
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, false);
    }
  
    public Televisor(double precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
        comprobarConsumoEnergetico(consumoEnergetico);
	    comprobarColor(color);
	    
    }
  //Metodo para Calcular el Precio Final del Televisor
    
   	public double precioFinal(){
   		
           //Invocamos el método precioFinal del método padre
           double subTotal = super.precioFinal();

           //Añadimos el codigo necesario
           if (resolucion > 40){
               subTotal += precioBase*0.3;
           }
           if (sintonizadorTDT){
               subTotal += 50;
           }
     
           return precioBase + subTotal;
       }
	
   
}
