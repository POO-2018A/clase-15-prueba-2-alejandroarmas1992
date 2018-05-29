/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.util.Scanner;
public class Principal {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int numEstudiante=0;
        System.out.println("*****INGRESO DE ESTUDIANTES*****");
         
      do{  int numMateria=0;
    
     
       
        Estudiante[] estudiantes=new Estudiante[5];
        Materia [] materias=new Materia [10];
        Scanner ingreso=new Scanner(System.in);
        Scanner ingreso2=new Scanner(System.in);
        Scanner ingreso3=new Scanner(System.in);
      
      System.out.println("Ingrese el Nombre del Estudiante");
      String nombreEst=ingreso.nextLine();
      System.out.println("Ingrese la Edad del Estudiante");
      int edad=ingreso.nextInt();
      System.out.println("Ingrese la  Materia 1 tomada por el Estudiante");
      String nomMat=ingreso2.nextLine();
       System.out.println("Ingrese el nivel de la Materia 1 tomada por el Estudiante");
      int nivMat=ingreso2.nextInt();
      System.out.println("Ingrese la  Materia 2 tomada por el Estudiante:");
      String nomMateria=ingreso3.nextLine();
      System.out.println("Ingrese el nivel de la Materia 2 tomada por el Estudiante");
      int nivMateria=ingreso3.nextInt();
      estudiantes[numEstudiante]=new Estudiante(nombreEst,edad);
      materias[numMateria]=new Materia (nomMat,nivMat);
      materias[numMateria+1]=new Materia (nomMateria,nivMateria);
      numEstudiante++;
      numMateria=numMateria+2;
      System.out.println("Se a ingresado el Estudiante con la Siguiente informacion:");
      System.out.println(estudiantes[numEstudiante-1]);
      System.out.println(materias[numMateria-1]);
      System.out.println(materias[numMateria-2]);
      int i;
              i=numEstudiante;
      if(numEstudiante>0 && numEstudiante<5){
      for(i;i>0;i--){
          if(estudiantes[numEstudiante].equals(estudiantes[i]) && materias[numMateria-1].equals(materias[numMateria-2]) && materias[numMateria].equals(materias[numMateria-3]))
          {System.out.println("El estudiante ya existe");
             
      }     
      
          }}}while(numEstudiante!=5);
      
        
    

}
}