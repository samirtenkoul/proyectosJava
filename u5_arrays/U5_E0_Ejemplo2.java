package u5_arrays;

//import java.io.IOException;
import java.util.*;//Scanner

public class U5_E0_Ejemplo2 {

    //public static int tamano=5; 
    public static void main(String[] args) throws java.io.IOException{
                      
        int []edades; //declaración array         
        char []frase;         
        edades=new int[5];//asignación de memoria         
        int i; //indice para recorrer el array         
        Scanner lector = new Scanner (System.in);         
        int menores18=0;         
        int mayores18=0;         
        int conta=0;         
        int cont=0; 
            
        //Inserción de datos         
        for (i=0; i<5;i++){             
            System.out.printf("Introduzca la edad del alumno %d: ",i+1);
            edades[i]=lector.nextInt();                
        }
        //Mostrar datos         
        for (i=0; i<5;i++){             
            System.out.printf("La edad del alumno %d es: %d \n",i+1,edades[i]);             
        }         
        //Consulta de datos         
        for (i=0; i<5;i++){             
            if (edades[i]>18){                
                mayores18++;              
            }
            else{                
                menores18++;
            }
        }         
        System.out.printf("Este año hay %d alumnos mayores de 18 y %d alumnos menores de 18\n",mayores18,menores18);
        frase=new char[20];         
        for (i=0; i<20;i++){             
        frase[i]=(char)System.in.read();                
        }         
        //Mostrar datos         
        System.out.printf("La frase introducida es: ");         
        for (i=0; i<20;i++){             
            System.out.printf("%c",frase[i]);             
        }         
        //Consulta de datos         
        for (i=0; i<20;i++){             
            if (frase[i]=='a'){                
                conta++;
            }    
            else {               
                cont++;
            }
        } 
    }
}
