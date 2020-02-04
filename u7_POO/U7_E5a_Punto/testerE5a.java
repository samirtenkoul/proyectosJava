package U7_E5a_Punto;

public class testerE5a {

    public static void main(String[] args) {
        
        //constructor vacio Triangulo
        Triangulo triangulo1 = new Triangulo ();
        
        /*
        Para llamar al constructor con parametros de tipo punto antes
        tenemos que crearnos esos puntos 
        
        Punto punto1 = new Punto (2,3);
        Punto punto2 = new Punto (4,5);
        Punto punto3 = new Punto (8,6);
        */
        //constructor parametros tipo punto de triangulo
        //Triangulo triangulo2 = new Triangulo (punto1, punto2, punto3);
        //constructor 6 parametros
        //Triangulo triangulo3 = new Triangulo (4.3,5.6,2.3,6.1,4.7,6.5);
        
        /*
        Crear e inicializar dos objetos de la clase Punto y mostrar
        la distancia entre ambos
        */
        Punto punto1 = new Punto (2,3);
        Punto punto2 = new Punto (4,5);
        
        System.out.printf("la distancia entre estos puntos es %.2f", punto1.calcularDistanciaDesde(punto2));
        
        System.out.println("");
        
        /*
        crear objeto clase circulo y mostrar area, perimetro y distancia a uno de los puntos
        */
        Circulo circulo1 = new Circulo();
        System.out.println("De circulo1 resultan:\n"
                + "area: "+circulo1.calcularArea()+"\n"
                + "perimetro: "+circulo1.calcularPerimetro()+"\n"
                + "distancia: "+circulo1.calcularDistanciadesde(punto2));
        /*
        crear objeto clase triangulo y mostrar area, perimetro y distancia
        */
        System.out.printf("De triangulo1 resultan:%n area: %.2f %n perimetro: %.2f %n distancia: %.2f",triangulo1.calcularArea(),triangulo1.calcularPerimetro() ,triangulo1.calcularDistanciaDesde(punto1));
        System.out.println("");
    }
}
