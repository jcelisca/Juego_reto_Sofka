// En esta clase se declara el metodo constructor con los getters y setters

//package preguntasyrespuestas;

public class Preguntas {
    private String pregunta; // se crean las variables de entrada 
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;

    // Se crea un metodo que permite generar una lista con una pregunta y 4 opciones de respuesta
    public Preguntas(String pregunta, String opcionA, String opcionB, String opcionC, String opcionD) { // metodo constructor
        this.pregunta = pregunta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
    }

    //getters y setters que permiten leer y modificar las varibles del metodo Pregunta
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(String opcionD) {
        this.opcionD = opcionD;
    }    
    
}
