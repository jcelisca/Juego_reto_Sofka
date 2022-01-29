
//package preguntasyrespuestas;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class PreguntasYrespuestas {
    public static String nombre;        // se crean 3 variables públicas para almacenar el nombre del jugador, la puntuación y el número 
    public static String score = "0";   // de la ronda. Se pueden modificar desde cualquier método
    public static int ronda = 1;
    public static File archivo;
    
    public static void main(String[] args) {
        
        archivo = new File("puntuacion.txt"); // se crea un archivo txt para guardar la informacion de los jugadores
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");            // se le solicita al usuario el nombre
        validar(BancoPreguntas.preguntass1(),BancoPreguntas.respuestass1());  // se ingresa al parámetro validar los ArrayList de las primeras preguntas con sus respuestas 
        
        if (ronda ==2){ // si el número de la ronda es 2, se aumenta el puntaje al jugador y se pasan las listas con las preguntas un poco más difíciles 
            score ="1000";
            JOptionPane.showMessageDialog(null,"¡Bien hecho!\n\n"+"Ahora juegas por 2000 puntos");
            validar(BancoPreguntas.preguntass2(),BancoPreguntas.respuestass2());
        }
        if(ronda == 3){ // se valida si la ronda es la 3 y se pasan los ArrayList con dificultad 3
            score = "2000";
            JOptionPane.showMessageDialog(null,"¡Bien hecho!\n\n"+"Ahora juegas por 5000 puntos");
            validar(BancoPreguntas.preguntass3(),BancoPreguntas.respuestass3());
        }
        if(ronda == 4){
            score = "5000";
            JOptionPane.showMessageDialog(null,"¡Bien hecho!\n\n"+"Ahora juegas por 10000 puntos");
            validar(BancoPreguntas.preguntass4(),BancoPreguntas.respuestass4());
        }
        if(ronda == 5){
            score = "10000";
            JOptionPane.showMessageDialog(null,"¡Bien hecho!\n\n"+"Ahora juegas por juegas por el puntaje máximo, 20000 puntos");
            validar(BancoPreguntas.preguntass5(),BancoPreguntas.respuestass5());
            if(ronda == 6){
                score = "20000";
                JOptionPane.showMessageDialog(null, "¡ Felicidades !\n\n"+"Haz alcanzado la máxima puntuación");
                JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+
                        "Jugador: "+nombre+"       Puntuacion: "+score);   
            }
        }
        
    }
    
    public static void validar (ArrayList<Preguntas> preguntas, ArrayList<String> respuestas){ // este método permite validar si la opción que eligió el usuario es correcta
        Random random = new Random(); // se crea un objeto de tipo random para obtener un número aleatorio
        int numero = random.nextInt(5); // se captura un número aleatorio entre 0 y 4 (posiciones del ArrayList en cada categoria)
        String opcion;                  // se crea luna variable para capturar la opcion elegida por el usuario
        String validador;               // variable que compara la elección del usuario con la opción correccta
        boolean entradaCorrecta = true; //
        
        while(entradaCorrecta){         // ciclo que valida si el usuario eligío una de las 4 opciones, o la opcion de retirarse. No termina el ciclo hasta obtener una opción valida 
            opcion = screen(numero, preguntas); // se llama el método screen para mostrar la pregunta en pantalla
            if("a".equals(opcion) || "A".equals(opcion)){  // se valida si la entrada es una A 
                entradaCorrecta = false;                   // si la entrada es una A, se rompe el ciclo para que el programa continue
                validador = preguntas.get(numero).getOpcionA(); // se le asigna a la variable validador el contenido de la posición A
                boolean correcto = respuestas.contains(validador); // se asigna a una variable booleana un true, si la opción elegida esta dentro de las lista de respuestas correctas
                if(correcto){                                      
                    JOptionPane.showMessageDialog(null,"¡Es correcto!"); // si correcto es true, se imprime que la resupuesta es corecta
                    ronda = ronda+1;                                     // se suma 1 al contador ronda para pasar a la siguiente lista de preguntas
                }else{
                    JOptionPane.showMessageDialog(null,"¡Es incorrecto! la respuesta es: " + respuestas.get(numero));
                    JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+          // si la opción elegida es incorrecta, se imprime un mensaje en pantalla y se termina la ejecución de la programa 
                        "Jugador: "+nombre+"       Puntuacion: "+score);
                    escribirArchivo(archivo);
                    System.exit(0);
                }
            }else if("b".equals(opcion) || "B".equals(opcion)){  // se hace la misma validación antes vista, pero con la opción B
                entradaCorrecta = false;
                validador = preguntas.get(numero).getOpcionB();
                boolean correcto = respuestas.contains(validador);
                if(correcto){
                    JOptionPane.showMessageDialog(null,"¡Es correcto!");
                    ronda = ronda+1;
                }else{
                    JOptionPane.showMessageDialog(null,"¡Es incorrecto! la respuesta es: " + respuestas.get(numero));
                    JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+
                        "Jugador: "+nombre+"       Puntuacion: "+score);
                    escribirArchivo(archivo);
                    System.exit(0);
                }
            }else if("c".equals(opcion) || "C".equals(opcion)){ // validación si la entrada es una C 
                entradaCorrecta = false;
                validador = preguntas.get(numero).getOpcionC();
                boolean correcto = respuestas.contains(validador);
                if(correcto){
                    JOptionPane.showMessageDialog(null,"¡Es correcto!");
                    ronda = ronda+1;
                }else{
                    JOptionPane.showMessageDialog(null,"¡Es incorrecto! la respuesta es: " + respuestas.get(numero));
                    JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+
                        "Jugador: "+nombre+"       Puntuacion: "+score);
                    escribirArchivo(archivo);
                    System.exit(0);
                }
            }else if("d".equals(opcion) || "D".equals(opcion)){ // Se valida si la entrada es una D
                entradaCorrecta = false;
                validador = preguntas.get(numero).getOpcionD();
                boolean correcto = respuestas.contains(validador);
                if(correcto){
                    JOptionPane.showMessageDialog(null,"¡Es correcto!");
                    ronda = ronda+1;
                }else{
                    JOptionPane.showMessageDialog(null,"¡Es incorrecto! la respuesta es: " + respuestas.get(numero));
                    JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+
                        "Jugador: "+nombre+"       Puntuacion: "+score);
                    escribirArchivo(archivo);
                    System.exit(0);
                }
            }else if("0".equals(opcion)){        // se valida si el valor ingesado es un 0
                JOptionPane.showMessageDialog(null, "Juego terminado\n\n"+ // si la entrada es 0, se imprime un mensaje en pantalla con los datos del jugador
                        "Jugador: "+nombre+"       Puntuacion: "+score);
                escribirArchivo(archivo);
                System.exit(0);  // se termina la ejecución del programa
            }
            else{
                JOptionPane.showMessageDialog(null,"La opción ingresada no es válida"); // si la entrada no es una A,B,C,D o un 0 se reinicia el ciclo
            }
        }
    }
    
    public static String screen(int numero,ArrayList<Preguntas> preguntas){ // Método que muestra en pantalla la pregunta con las 4 opciones
        
        String option = JOptionPane.showInputDialog("Puntuación: "+score+"               "  
                    +"            "+"Ronda: "+ronda+"\n\n"+
                    preguntas.get(numero).getPregunta()+"\n"+
                    "A. "+preguntas.get(numero).getOpcionA()+"\n"+
                    "B. "+preguntas.get(numero).getOpcionB()+"\n"+
                    "C. "+preguntas.get(numero).getOpcionC()+"\n"+
                    "D. "+preguntas.get(numero).getOpcionD()+"\n\n"+
                    "0 Retiarse                             Jugador: "+nombre+"\n\n");
        
        return option;
    }
    
    public static void escribirArchivo(File archivo){

        try{
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            BufferedWriter archivoEscribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
            archivoEscribe.write("Nombre: "+nombre+"      Puntuación: "+score+"\n");
            archivoEscribe.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }
}



