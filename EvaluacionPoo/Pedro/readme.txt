Se crea una clase Electrodomestico, que va a ser la Super Clase, esta lleva como atributos precio base, 
color, consumo energético (letras entre A y F) y peso, Implementa los Metodos 

comprobarConsumoEnergetico(), recibe como parametro un char, este estcomprueba que la letra ingreasada es correcta, sino es correcta
 usara la letra por defecto. 
comprobarColor(), recibe como parametro una cadena y comprueba que el color es correcto, sino lo es usa el color por defecto. 

precioFinal(), este calculará el precio total del Electrodomestico en base a unas condiciones segun el consumo y su tamaño. Se usa un 
switch case para validadar el consumo energetico y segun el se calcula un subtotal en base a la tabla dada, luego a ese subtotal se le
suma otro valor segun su peso.

Luego se crean dos clases Lavadora y Televisor, estas heredan de Electrodomésticos, por lo tanto heredan sus atributos, constantes
y metodos y tienen tambien sus atributos propios e implementan sus metodos especificos.

Luego en la Clase ejecutable se Instancia un objeto de la clase Electordomesticos llamada misElectrodomesticos, se crea un Arregglo
de Objetos de tipo Electrodomesticos, de 10 indices y allí se instancian los objetos de tipo Electrodomestico, Lavadora y Televisor,
 y se le van inicializando sus atributos según el constructor que sea llamado.

Luego, a travez de un ciclo for recorro el arreglo y en cada indice se pregunta si ese objeto pertenece a alguna clase, instanceOf, 
en la clase a la que pertenezca se le sumará su precio al precio final de la clase. En otras palabras, cuando un Televisor o una 
Lavadora este en la indice actual del array, pasara por su clase y por la de Electrodomestico, ya que una ya que heredan de la 
super clase Electrodomestico y alli se ejecuta en cada uno su propia version del metodo precioFinal.

Luego se mandan a imprimir por pantalla el total del precio final de cada clase
             