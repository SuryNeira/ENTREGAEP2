/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//integrantes: Benjamín Vasquez, Jatsury Neira
//integrantes: Benjamín Vasquez, Jatsury Neira
/**
 *
 * @author suris
 */
public class Principal {
    
    public static Usuario usuario;
    public static Feed feed;
    
    public static void InsertarDatosArchivos () throws FileNotFoundException {
        
        String file = "src/test/java/estudiantes.txt";
        int i=0;
        
        try{
         
         File archivo=new File(file);
         System.out.println(archivo.getAbsolutePath());
         Scanner scanner = new Scanner(archivo);
         
         while (scanner.hasNext()) {
                  String []datos=scanner.next().split(";");
                  System.out.print("Linea "+i + " Titulo:"+datos[0]);
                  System.out.print(" Numero:"+datos[1]);
                  System.out.print(" Descripcion:"+datos[2]);
                  System.out.print(" HoraCreacionTarea:"+datos[3]);
                  System.out.println(" PrioridadTarea:"+datos[4]);
                  System.out.println(" EstadoTarea:"+datos[4]);
                  i++;
         }
          scanner.close();
     }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
      
    }
    
        public static void main(String args[]) throws FileNotFoundException {
       
        
        InsertarDatosArchivos();
         
         int tamanyo=5;
         
         Tarea[] tareas=new Tarea[tamanyo];
         
         for(int i=0; i<tareas.length; i++){
             tareas[i]=new Tarea();
             tareas[i].setTitulo("Estudiar Fisica");
             tareas[i].setDescripcion("Estudiar 2 horas");
             tareas[i].setEstadoTarea("incompleta");
             tareas[i].setHoraCreacionTarea(13.05);
             tareas[i].setNumero(1);
             tareas[i].setPrioridadTarea("alta");
             
         }
         
         System.out.println("Tarea: "+tareas[0].getTitulo());
         
    
             Dia dia=new Dia();
             dia.setCalificacionDia(5);
             dia.setConsejoDeProductividad("Organiza una tarea grande en pequeñas tareas");
             dia.setNombreDia("Miercoles");
             dia.setFechaDia("25/03/23");
             
         
          System.out.println("Dia: "+dia.getNombreDia());
   
          Publicacion[] publicaciones=new Publicacion[tamanyo];
          for(int i=0; i<publicaciones.length; i++){
              
              publicaciones[i]=new Publicacion();
              publicaciones[i].setFechaPublicacion("24/09/23");
              publicaciones[i].setIdUsuarioPublicacion(456);
              publicaciones[i].setPrivacidadPublicacion("Publico");
              publicaciones[i].setSumaInteraccionPositiva(1);
              publicaciones[i].setSumaInteraccionNegativa(0);
              
          }
          
          ListaDeTareasPorHacer listaTareas=new ListaDeTareasPorHacer();
          listaTareas.setIdLista(425);
          
          Usuario[] usuarios=new Usuario[tamanyo];
          for(int i=0; i<usuarios.length;i++){
              usuarios[i]=new Usuario();
              usuarios[i].setAlias("Pepe");
              usuarios[i].setDescripcionPerfil("Persona feliz");
              usuarios[i].setFechaCreacionDeLaCuenta("24/08/23");
              usuarios[i].setIdUsuario(345);
              usuarios[i].setNombre("Pedro");
          }
          
          
          Calendario calendario = new Calendario();
          calendario.setAnyoCalendario(2023);
          calendario.setIdCalendario(1);
          
          //menu
          int opc = 0;
          switch (opc){
            case 1: //modifica admin
                    calendario.agregarDia(dia);
                    break;
                case 2: //modifica a algun empleado
                    calendario.modifCalendario(new ArrayList<Dia>(), tamanyo);
                    break;
                case 3:
                    calendario.eliminarDia(dia);
                    break;
                case 4:
                    calendario.mostrarCalendario();
                    break;
            }
       
          
         
          
    
}

}