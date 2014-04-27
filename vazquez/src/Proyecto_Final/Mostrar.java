
package Proyecto_Final;


public class Mostrar {

   
    public static void main(String[] args) throws Exception {
        for (Pregunta p : Cuestionario.leerPregunta() ){
          
          
          if (p.getId() == 2){
          
          System.out.println(p.getId() + ". " + p.getPregunta());
          
          for (Opciones o : p.getOpciones() ){
              
              System.out.println("\t" + o.getIdop() + ". " + o.getOpcion() + " = " + o.isRespuesta());
          }
          
          }
          
      }
          
    }
    }
    

