package com.EvaluacionPoo.Pedro;

public class Lavadora extends Electrodomestico{
	protected final static int CARGA_DEFECTO = 5;
	
	private int carga;
	
	//Metodos Set y Get
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	//Constructores
	public Lavadora(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
  
    public Lavadora(double precioBase, int peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
  
    public Lavadora(double precioBase, int peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
        comprobarConsumoEnergetico(consumoEnergetico);
	    comprobarColor(color);
	    
    }
    //Metodo para Calcular el precio Final de la Lavadora
    @Override
    public double precioFinal(){
        
        double subTotal = super.precioFinal();
  
       
        if (carga > 30){
            subTotal += 50;
        }
  
        return precioBase + subTotal;
    }

	
}
