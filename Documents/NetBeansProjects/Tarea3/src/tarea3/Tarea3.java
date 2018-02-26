//* este es el link de mi repositorio y mis commits https://github.com/joseguifa/Tarea3_201602646.git *//









package tarea3;

import java.io.IOException;
import java.util.Scanner;




public class Tarea3 {

    
    public static void main(String[] args) throws IOException {
      //* en este cuadro  voy a declarar mi variable donde se van a guardar los numeros que escoja para ingresar a una opcion del menu luego tengo que ingresar un metodo llamado scanner que sirve para leer valores ingresados y pueden ser de tipo string o int *//
       int opciones;
       Scanner entrada = new Scanner (System.in);
      // aqui voy a escribir lo que se mostrara en consola practicamente mi menu //
       System.out.println("1. Usuarios ");
        System.out.println("2. Contador de digitos ");
         System.out.println("3. Tres números de mayor a menor ");
          System.out.println("4. Calcular promedio ");
           System.out.println("5. Salir");
           
       // en esta parate estoy declarando que la variable opciones sera lo que es scann va a leer y se guarde en esta variable //
       opciones = entrada.nextInt();
       // luego realizo mi seleccion de opciones principales utilizando un switch y pueda entrar en el caso asignado para cada situacion //
       switch (opciones){
       
           case 1:
               System.out.println("1. Ingresar Usuarios");
               System.out.println("2. Mostrar Usuarios ascendente ");
               System.out.println("3. Mostrar Usuarios descendente");
               System.out.println("4. Menu principal ");
               // aqui vamos a nuevamente usar un switch para  poder seleccionar una opcion de este segundo submenu //
               int opciones_caso1 = 0;
               Scanner ingreso= new Scanner (System.in);
               opciones_caso1 = ingreso.nextInt();
               
              
               
               
               
               
               
               
               
               switch (opciones_caso1){
                   // en este caso vamos a realizar lo que se nos pide en la tarea ingresar un vector y revisar que sea diferente //
                   
                   case 1: 
                       // aqui vamos a utilizar scanner e importar su libreria para poder ingresar datos desde consola//
                       Scanner lector =new Scanner(System.in);
                       // aqui voy a crear el vector de 5 pocisiones //
                       int vector5 []= new int [5];
                       
                       int z;
                       int i;
                      
                       //para que pueda ser util este vector necesitamos un "for" que pueda realizar en el ingreso indicado por el vector //

                       for ( z=0;z<=4 ;z++){
                         System.out.println("X["+(z+1)+"]=");
                         
                         // en esta variable se van a guardar los datos que ingresemos //
                         vector5[z]= lector.nextInt();
                         
                        
                                
                         //aqui vamos a realizar un for anidado para poder realizar la comparacion si el usuario ya existe //
                        for ( i=0;i<=4 ;i++){
                            if (vector5[i].equals(vector5[1]))
                         
                             System.out.println("el usuario ya esta registrado pruebe con otro");
                            
                             else
                             System.out.println("regresar al menu de esta seccion " );
                         
                         }
                         
                         }
                         }  
                       break ;
       
                       
                       
                       
                       case 2:
                           
                           
                       break ;
                       case 3: 
                           
                       break ;
                       case 4:
                           
                       break ;
               
               
               } 
               
               
               
               
               
               
               break;
               
               case 2:
               System.out.println("1. Ingresar numero");
               System.out.println("2. Mostrar numero de digitos ");
               System.out.println("Menu principal");
               
               
               
               
               break;
               
               case 3:
               System.out.println("1. Ingresar números");
               System.out.println("2. Mostrar ordenados");
               System.out.println("3. Menu principal ");
               break;
               
               case 4:
                
               
               
               
               
               
               break;
               
               case 5:
               System.exit(0);
       
               break;
               
               
               
       
       
       }
    
    
    
    }

    private static void Switch(int opciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}
