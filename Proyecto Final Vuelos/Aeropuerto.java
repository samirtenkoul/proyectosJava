package vuelos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Aeropuerto {
   ArrayList<Vuelo> aeropuerto;

    public Aeropuerto(ArrayList<Vuelo> aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Aeropuerto() {
        aeropuerto= new ArrayList(0);
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
            aeropuerto.add(new Nacional());
            }
            else{
            aeropuerto.add(new Internacional());
            }
        }
    }

    public ArrayList<Vuelo> getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(ArrayList<Vuelo> aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    @Override
    public String toString() {
        String aero="Aeropuerto{\n";
        for (int i = 0; i < this.aeropuerto.size(); i++) {
            aero+=this.aeropuerto.get(i)+"\n";
        }
        return aero;
    }
    public void añadirVuelo(){
        Scanner s= new Scanner(System.in);
         boolean correcto=false;
        System.out.println("¿Qué tipo de vuelo desea añadir?\n 1.Internacional\n 2.Nacional");
        while(!correcto){
        if(s.hasNextInt()){
            int opcion=s.nextInt();
            if(opcion==1){
                System.out.println("Creando vuelo internacional");
                System.out.println("Introduzca el id del vuelo");
                String id=s.next();
                System.out.println("Introduzca la aerolinea a la que pertenece el vuelo");
                String aerolinea=s.next();
                System.out.println("Introduzca el origen del vuelo");
                String origen=s.next();
                System.out.println("Introduzca el destino del vuelo");
                String destino=s.next();
                System.out.println("Introduzca la fecha en la que se efectuará el vuelo");
                String fecha=s.next();
                System.out.println("Introduzca cuantos pasajeros tendrá el vuelo");
                int numPasajeros=s.nextInt();
                System.out.println("Introduzca el precio del billete para este vuelo");
                Double precio=s.nextDouble();
                System.out.println("(s/n)¿Este vuelo hará escala?");
                boolean valido=false;
                boolean escala=false;
                while(!valido){
                    String aux2=s.next();
                    if(aux2.equalsIgnoreCase("S")){
                        valido=true;
                        escala=true;
                    }
                    if(aux2.equalsIgnoreCase("N")){
                        valido=true;
                        escala=false;
                    }
                    else{
                        System.out.println("Debe introducir s ó n");
                    }
                }
                 ArrayList<String> escalas = new ArrayList(0);
                if(escala){
                    System.out.println("Cuantas escalas hara?(Introduzca un numero)");
                    valido=false;
                    while(!valido){
                    if(s.hasNextInt()){
                        int cuantos=s.nextInt();
                        for (int i = 0; i < cuantos; i++) {
                            System.out.println("Introduzca siguiente escala");
                            escalas.add(s.next());
                        }
                        valido=true;
                    }
                    else{
                        System.out.println("debe introducir un numero");
                    }
                }
                }
                if(escala){
                this.aeropuerto.add(new Internacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio,escala,escalas));
                }
                else{
                this.aeropuerto.add(new Internacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio,escala));
                }
                correcto=true;
                }
            else if(opcion==2){
                System.out.println("Creando vuelo nacional");
                System.out.println("Introduzca el id del vuelo");
                String id=s.next();
                System.out.println("Introduzca la aerolinea a la que pertenece el vuelo");
                String aerolinea=s.next();
                System.out.println("Introduzca el origen del vuelo");
                String origen=s.next();
                System.out.println("Introduzca el destino del vuelo");
                String destino=s.next();
                System.out.println("Introduzca la fecha en la que se efectuará el vuelo");
                String fecha=s.next();
                System.out.println("Introduzca cuantos pasajeros tendrá el vuelo");
                int numPasajeros=s.nextInt();
                System.out.println("Introduzca el precio del billete para este vuelo");
                Double precio=s.nextDouble();
 
                this.aeropuerto.add(new Nacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio));
                correcto=true;
            }
            else{
            System.out.println("Debe introducir una opcion correcta(1 ó 2)");
            }
        }
        else{
            System.out.println("Debe introducir una opcion correcta(1 ó 2)");
        }
        }
    }
    public void consultarVuelos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Consultando vuelos...");
        System.out.println("Introduzca el origen");
        String origen= s.next();
        System.out.println("Introduzca el destino");
        String destino=s.next();
        System.out.println("Introduzca el precio máximo que desea pagar");
        int max=s.nextInt();
        System.out.println("Introduzca el precio minimo que desea pagar");
        int min=s.nextInt();
        for (int i = 0; i < this.aeropuerto.size(); i++) {
            if(this.aeropuerto.get(i).getOrigen().equals(origen) && this.aeropuerto.get(i).getDestino().equals(destino) && this.aeropuerto.get(i).getPrecio()>min && this.aeropuerto.get(i).getPrecio()<max){
                System.out.println(this.aeropuerto.get(i));
            }
        }
    }
    public void actualizarVuelo(){
        Scanner s= new Scanner(System.in); // doy por hecho que mete los tipos correctos y no compruebo en cada escaneo de datos que es del tipo y valro adecuado
        for (int i = 0; i < this.aeropuerto.size(); i++) {
                System.out.println((i+1)+""+this.aeropuerto.get(i));
        }
        System.out.println("Introduzca el numero del vuelo que desea definir escalas");
        int numVue=s.nextInt()-1;
        Internacional i=new Internacional(this.aeropuerto.get(numVue).getId(),this.aeropuerto.get(numVue).getAerolinea(),this.aeropuerto.get(numVue).getOrigen()
        ,this.aeropuerto.get(numVue).getDestino(),this.aeropuerto.get(numVue).getFecha(),this.aeropuerto.get(numVue).getNumPasajeros(),this.aeropuerto.get(numVue).getPrecio(),
        true);
        i.setEscala(true);
       ArrayList<String> a= new ArrayList(0);
        System.out.println("Cuantas escalas tendra el vuelo?");
        int numEscalas=s.nextInt();
        for (int j = 0; j < numEscalas; j++) {
            System.out.println("Introduzca siguiente escala");
            a.add(s.next());
        }
        i.setEscalas(a);
        this.aeropuerto.set(numVue, i);
          for (int t = 0; t < this.aeropuerto.size(); t++) {
                System.out.println((t+1)+""+this.aeropuerto.get(t));
        }
    }
    public void eliminarVuelos(){
        Scanner s = new Scanner(System.in);
        System.out.println(this.aeropuerto.size());
        System.out.println("Procediendo a eliminar vuelos");
        System.out.println("Introduzca el origen de los vuelos");
        String origen=s.next();
        System.out.println("Introduzca el destino de los vuelos");
        String destino=s.next();
        for (int i = 0; i < this.aeropuerto.size(); i++) {
            if(this.aeropuerto.get(i).getOrigen().equals(origen) && this.aeropuerto.get(i).getDestino().equals(destino)){
                System.out.println(this.aeropuerto.get(i));
                System.out.println("Desea eliminar este vuelo?(s/n)");
                String respuesta=s.next();
                if(respuesta.equalsIgnoreCase("s")){
                    this.aeropuerto.remove(i);
                    i--;
                }
            }
        }
         System.out.println(this.aeropuerto.size());
    }
    public void consultaOrdenada(){
        Scanner s = new Scanner(System.in);
        System.out.println("Obteniendo lista ordenada");
        System.out.println("Introduzca el origen de los vuelos");
        String origen=s.next();
        System.out.println("Introduzca el destino de los vuelos");
        String destino=s.next();
        TreeSet<Vuelo> vuelos = new TreeSet(this.aeropuerto);
        this.aeropuerto=new ArrayList(vuelos);
        for (int i = 0; i < this.aeropuerto.size(); i++) {
            if(this.aeropuerto.get(i).getOrigen().equalsIgnoreCase(origen) &&this.aeropuerto.get(i).getDestino().equalsIgnoreCase(destino) ){
            System.out.println(this.aeropuerto.get(i));
            }
        }
    }
    public void consultaPorRentabilidad(){
        Scanner s = new Scanner(System.in);
        System.out.println("Obteniendo lista ordenada por rentabilidad");
      TreeSet<Vuelo> vuelos= new TreeSet(new porRentabilidad());
        for (int i = 0; i < this.aeropuerto.size(); i++) {
            vuelos.add(this.aeropuerto.get(i));
        }
        ArrayList<Vuelo> aux= new ArrayList(vuelos);
        for (int i = 0; i < aux.size(); i++) {
            System.out.println(aux.get(i));
            
        }
    }
}
