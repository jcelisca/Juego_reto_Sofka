// En esta clase se crean las 25 preguntas con sus respectivas respuestas.
// Se crean 5 ArrayList de preguntas y 5 con las respuestas correctas, creando 5 rangos de dificultad

//package preguntasyrespuestas;

import java.util.ArrayList;

public class BancoPreguntas {

        public static ArrayList<Preguntas> preguntass1() { // método para crear la lista de preguntas mas sencillas

                ArrayList<Preguntas> preguntas1 = new ArrayList(); // se crea un ArrayList de tipo Pregunta para luego
                                                                   // llenarlo
                                                                   // con los objetos de la clase

                Preguntas facil1 = new Preguntas("¿Quién formuló la Teoría de la Relatividad?", "Nikola Tesla",
                                "Thomas Edisson", "Albert Einstein", "Isaac Newton");// se crea un objeto de la clase
                                                                                     // pregunta,
                Preguntas facil2 = new Preguntas("¿Quién es la persona más rica del mundo?", "Jeff Bezos", "Elon Musk",
                                "Mark Zuckerberg", "Bill  Gates"); // ingresando los strings de pregunta y opciones
                Preguntas facil3 = new Preguntas("¿Cuál es el órgano más grande del cuerpo humano?", "El hígado",
                                "La lengua", "La piel", "El cerebro");
                Preguntas facil4 = new Preguntas("¿Cuál es el planeta más cercano al Sol?", "Júpiter", "Venus",
                                "Mercurio", "Saturno");
                Preguntas facil5 = new Preguntas("¿Cuál es el primer libro de la Biblia?", "El Génesis", "Levíticos",
                                "Éxodo", "Deuteronomio");
                preguntas1.add(facil1); // se añade cada objeto al ArrayList
                preguntas1.add(facil2);
                preguntas1.add(facil3);
                preguntas1.add(facil4);
                preguntas1.add(facil5);

                return preguntas1; // Se devuelve la variable ArrayList que contiene las 5 preguntas con sus
                                   // opciones
        }

        public static ArrayList<String> respuestass1() { // Método que crea una ArrayList con las respuestas correctas

                ArrayList respuestas1 = new ArrayList(); // Se crea un ArrayList para almacenar las repuestas correctas
                                                         // de cada
                                                         // pregunta
                respuestas1.add(preguntass1().get(0).getOpcionC()); // Se accede a la posición que contiene la repuesta
                                                                    // correcta
                                                                    // y se agrega al ArrayList
                respuestas1.add(preguntass1().get(1).getOpcionA()); // se agrega la repuesta correcta a cada pregunta
                respuestas1.add(preguntass1().get(2).getOpcionC());
                respuestas1.add(preguntass1().get(3).getOpcionC());
                respuestas1.add(preguntass1().get(4).getOpcionA());

                return respuestas1; // Se devuelve el ArrayList con las repuestas para las primeras cinco preguntas
        }

        // Se crean otros 4 ArrayList para los niveles restantes, con las 4 listas de
        // respuestas correctas
        // Se crean los Métodos de preguntas y respuestas de la misma forma que para las
        // 2 primeras listas
        public static ArrayList<Preguntas> preguntass2() {

                ArrayList<Preguntas> preguntas2 = new ArrayList();

                Preguntas facil1 = new Preguntas("¿En qué año cayó el muro de Berlín?", "En 1960", "En 1989", "En 1890",
                                "En 1976");
                Preguntas facil2 = new Preguntas("¿Cuántos años duró la Primera Guerra Mundial?", "8 años", "2 años",
                                "5 años", "4 años");
                Preguntas facil3 = new Preguntas("¿Cuál es el océano más grande del mundo?", "El océano Pacífico",
                                "El océano Atlántico", "El océano Índico", "El océano Ártico");
                Preguntas facil4 = new Preguntas("¿Cuál es el animal más grande de la Tierra?", "La ballena azul",
                                "El elefante africano", "El calamar gigante", "La ballena gris");
                Preguntas facil5 = new Preguntas("¿Cuál es el libro sagrado del Islam?", "La Biblia", "El Corán",
                                "La Torá", "Libro de Marmón");
                preguntas2.add(facil1);
                preguntas2.add(facil2);
                preguntas2.add(facil3);
                preguntas2.add(facil4);
                preguntas2.add(facil5);

                return preguntas2;
        }

        public static ArrayList<String> respuestass2() {

                ArrayList respuestas2 = new ArrayList();
                respuestas2.add(preguntass2().get(0).getOpcionB());
                respuestas2.add(preguntass2().get(1).getOpcionD());
                respuestas2.add(preguntass2().get(2).getOpcionA());
                respuestas2.add(preguntass2().get(3).getOpcionA());
                respuestas2.add(preguntass2().get(4).getOpcionB());

                return respuestas2;
        }

        public static ArrayList<Preguntas> preguntass3() {

                ArrayList<Preguntas> preguntas3 = new ArrayList();

                Preguntas facil1 = new Preguntas("¿Quién ha protagonizado la saga de Indiana Jones?",
                                "Leonardo Dicaprio", "Robert Downey Jr.", "Harrison Ford", "Tom Cruise");
                Preguntas facil2 = new Preguntas("¿Cuál es el libro más vendido de la historia?", "La Biblia",
                                "50 sombras de Gray", "Álgebra de Baldor", "Harry Potter");
                Preguntas facil3 = new Preguntas("¿Cuál es el enemigo más famoso de Batman?", "El Joker", "El pinguino",
                                "Doble cara", "Deathstroke");
                Preguntas facil4 = new Preguntas("¿Cuándo llegó el hombre a la Luna?", "En 1979", "En 1960", "En 1982",
                                "En 1969");
                Preguntas facil5 = new Preguntas("¿Quién es el fundador de Facebook?", "Jack Dorsey", "Elon Musk",
                                "Bill Gates", "Mark Zuckerberg");
                preguntas3.add(facil1);
                preguntas3.add(facil2);
                preguntas3.add(facil3);
                preguntas3.add(facil4);
                preguntas3.add(facil5);

                return preguntas3;
        }

        public static ArrayList<String> respuestass3() {

                ArrayList respuestas3 = new ArrayList();
                respuestas3.add(preguntass3().get(0).getOpcionC());
                respuestas3.add(preguntass3().get(1).getOpcionA());
                respuestas3.add(preguntass3().get(2).getOpcionA());
                respuestas3.add(preguntass3().get(3).getOpcionD());
                respuestas3.add(preguntass3().get(4).getOpcionD());

                return respuestas3;
        }

        public static ArrayList<Preguntas> preguntass4() {

                ArrayList<Preguntas> preguntas4 = new ArrayList();

                Preguntas facil1 = new Preguntas("¿Cuántas estrellas hay en la bandera estadounidense?", "20 estrellas",
                                "40 estrellas", "50 estrellas", "35 estrellas");
                Preguntas facil2 = new Preguntas("¿Cuántas notas musicales existen?", "Diez", "Doce", "Siete", "nueve");
                Preguntas facil3 = new Preguntas("¿Cuál fue la primera película de Disney?",
                                "Blancanieves y los 7 enanos", "El jorobado de Notre Dame", "Pinocho", "Pter Pan");
                Preguntas facil4 = new Preguntas("¿Cuántos dientes tiene el ser humano?", "30", "28", "32", "34");
                Preguntas facil5 = new Preguntas("¿Qué animal contagió a los humanos en la pandemia de peste negra?",
                                "Las ratas", "Las pulgas", "El zancudo", "El murciélago");
                preguntas4.add(facil1);
                preguntas4.add(facil2);
                preguntas4.add(facil3);
                preguntas4.add(facil4);
                preguntas4.add(facil5);

                return preguntas4;
        }

        public static ArrayList<String> respuestass4() {

                ArrayList respuestas4 = new ArrayList();
                respuestas4.add(preguntass4().get(0).getOpcionC());
                respuestas4.add(preguntass4().get(1).getOpcionB());
                respuestas4.add(preguntass4().get(2).getOpcionA());
                respuestas4.add(preguntass4().get(3).getOpcionC());
                respuestas4.add(preguntass4().get(4).getOpcionB());

                return respuestas4;
        }

        public static ArrayList<Preguntas> preguntass5() {

                ArrayList<Preguntas> preguntas5 = new ArrayList();

                Preguntas facil1 = new Preguntas(
                                "¿Qué género literario fue el primero en recibir un premio Nobel de Literatura?",
                                "Novelista", "Dramaturgo", "Poeta", "Ensayista");
                Preguntas facil2 = new Preguntas("¿A que país pertenecen los cariocas?", "Brasil", "Portugal",
                                "Puerto Rico", "México");
                Preguntas facil3 = new Preguntas("¿Cuál es la isla más grande del mundo?", "Madagascar", "Baffin",
                                "Groenlandia", "Sumatra");
                Preguntas facil4 = new Preguntas("¿Cuál era el nombre del dios del Sol en el Antiguo Egipto?", "Amón",
                                "Ra", "Horus", "Anubis");
                Preguntas facil5 = new Preguntas("¿Qué distancia hay de la Tierra al Sol? ", "399 millones de km",
                                "100 millones de km", "30 millones de km", "149,6 millones de km");
                preguntas5.add(facil1);
                preguntas5.add(facil2);
                preguntas5.add(facil3);
                preguntas5.add(facil4);
                preguntas5.add(facil5);

                return preguntas5;
        }

        public static ArrayList<String> respuestass5() {

                ArrayList respuestas5 = new ArrayList();
                respuestas5.add(preguntass5().get(0).getOpcionC());
                respuestas5.add(preguntass5().get(1).getOpcionA());
                respuestas5.add(preguntass5().get(2).getOpcionC());
                respuestas5.add(preguntass5().get(3).getOpcionB());
                respuestas5.add(preguntass5().get(4).getOpcionD());

                return respuestas5;
        }
}
