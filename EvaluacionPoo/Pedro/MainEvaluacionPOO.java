package com.EvaluacionPoo.Pedro;

public class MainEvaluacionPOO {

	public static void main(String[] args) {
		
		//Definimos un arreglo de Obejetos de tipo Electrodomesticos
        Electrodomestico misElectrodomesticos[] = new Electrodomestico[10];
   
        //Asignamos cada una de las posiciones
        misElectrodomesticos[0] = new Electrodomestico(1200, 45, "Azul", 'G');
        misElectrodomesticos[1] = new Lavadora(250, 30, 'A', "blanco", 25);
        misElectrodomesticos[2] = new Televisor(3500, 60, 'A', "negro", 42, true);
        misElectrodomesticos[3] = new Electrodomestico(200, 40, "Amarillo", 'K');
        misElectrodomesticos[4] = new Electrodomestico(350, 20, "gris", 'D');
        misElectrodomesticos[5] = new Lavadora(3000, 40, 'A', "blanco", 40);
        misElectrodomesticos[6] = new Televisor(300, 22, 'A',"Negro", 32,true);
        misElectrodomesticos[7] = new Lavadora(400, 100, 'A', "verde", 35);
        misElectrodomesticos[8] = new Televisor(3500, 60, 'A', "negro", 42, true);
        misElectrodomesticos[9] = new Electrodomestico(500, 100, "Negro", 'A');
   
        //Variables para almacenar la suma de los precios
        double totalElectrodomesticos = 0;
        double totalTelevisores = 0;
        double totalLavadoras = 0;
        
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i = 0; i < misElectrodomesticos.length; i++){
               
            if(misElectrodomesticos[i] instanceof Electrodomestico){
                totalElectrodomesticos += misElectrodomesticos[i].precioFinal();
            }
            if(misElectrodomesticos[i] instanceof Lavadora){
               totalLavadoras += misElectrodomesticos[i].precioFinal();
            }
            if(misElectrodomesticos[i] instanceof Televisor){
                totalTelevisores +=  misElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("El Total de los Electrodomesticos es de " + totalElectrodomesticos);
        System.out.println("El Total de las Lavadoras es de " + totalLavadoras);
        System.out.println("El Total de los Televisores es de " + totalTelevisores);
   
  }

}
