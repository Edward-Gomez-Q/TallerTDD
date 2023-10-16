package org.example;

public class Ascensor {
    private char pisoActual;
    private char pisoDestino;
    private boolean puertaAbierta;
    public Ascensor(){
        pisoActual='1';
        puertaAbierta=false;
    }
    //Funcion para generar una persona aleatoria
    public void crearPersona(){
        int pisoAleatorio = (int) (Math.random() * 3) + 1;
        pisoDestino = (char) (pisoAleatorio + '0');
    }
    //Funcion para generar un piso destino aleatorio que no sea el mismo piso actual
    public void crearPisoDestino(){
        int[] pisos;
        if(pisoActual=='1'){
            pisos = new int[]{2,3};
        }else if(pisoActual=='2'){
            pisos = new int[]{1,3};
        }else{
            pisos = new int[]{1,2};
        }
        int pisoAleatorio = (int) (Math.random() * 2);
        pisoDestino = (char) (pisos[pisoAleatorio] + '0');
    }
    //Funcion para abrir y cerrar la puerta
    public void abrirPuerta(){
        puertaAbierta=true;
    }
    public void cerrarPuerta(){
        puertaAbierta=false;
    }
    //Funcion para subir el ascensor
    public void subirAscensor(){
        int pisoActualInt = pisoActual - '0';
        int pisoDestinoInt = pisoDestino - '0';
        for(int i=pisoActualInt;i<=pisoDestinoInt;i++){
            this.pisoActual=(char) (i+'0');
        }
    }
    //Funcion para bajar el ascensor
    public void bajarAscensor(){
        int pisoActualInt = pisoActual - '0';
        int pisoDestinoInt = pisoDestino - '0';
        for(int i=pisoActualInt;i>=pisoDestinoInt;i--){
            this.pisoActual=(char) (i+'0');
        }
    }
    //Funcion para mostrar el estado del ascensor
    public void mostrarEstado(){
        System.out.println("--------------------");
        System.out.println("Piso actual: "+pisoActual);
        System.out.println("Piso destino: "+pisoDestino);
        System.out.println("--------------------");
    }
    //Funcion para llamar al ascensor
    public void moverAscensor(){
        cerrarPuerta();
        if(pisoActual<pisoDestino){
            subirAscensor();
        }else if(pisoActual>pisoDestino){
            bajarAscensor();
        }
        abrirPuerta();
    }
    //Funcion para

    //Funcion para ejecutar el ascensor
    public void ejecutarAscensor(){
        crearPersona();
        System.out.println("Persona Generada en : "+this.pisoDestino);
        System.out.println("Mover ascensor a "+this.pisoDestino + " para recoger a la persona");
        mostrarEstado();
        moverAscensor();
        crearPisoDestino();
        System.out.println("Persona quiere ir a : "+this.pisoDestino);
        System.out.println("Mover ascensor a "+this.pisoDestino + " para dejar a la persona");
        mostrarEstado();
        moverAscensor();
        System.out.println("Persona llego a su destino : "+this.pisoDestino);
        mostrarEstado();
    }

    public char getPisoActual() {
        return pisoActual;
    }

    public char getPisoDestino() {
        return pisoDestino;
    }
}

