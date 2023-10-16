package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AscensorTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    //Test para verificar que al inicio el piso actual es 1
    @Test
    public void cuandoIniciaPisoActualEs1(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba
        //3. Verificacion o Assert
        assert(ascensor.getPisoActual()=='1');
    }
    //Test para verificar que la persona se crea en un piso aleatorio de 1 a 3
    @Test
    public void cuandoCreaPersonaPisoAleatorio(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba
        ascensor.crearPersona();
        //3. Verificacion o Assert
        assert(ascensor.getPisoDestino()>='1' && ascensor.getPisoDestino()<='3');
    }
    //Test para verificar que el piso destino es diferente al piso actual
    @Test
    public void cuandoCreaPisoDestinoDiferentePisoActual(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba
        ascensor.crearPersona();
        ascensor.crearPisoDestino();
        //3. Verificacion o Assert
        assert(ascensor.getPisoActual()!=ascensor.getPisoDestino());
    }


    //Test para cuando el ascensor tiene un movimiento
    @Test
    public void cuandoMovimientos1(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba
        ascensor.ejecutarAscensor();
        //3. Verificacion o Assert
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
    }
    //Test para cuando el ascensor tiene dos movimientos
    @Test
    public void cuandoMovimientos2(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba y assert
        ascensor.ejecutarAscensor();
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
        ascensor.ejecutarAscensor();
        //3. Verificacion o Assert
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
    }
    //Test para cuando el ascensor tiene tres movimientos
    @Test
    public void cuandoMovimientos3(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();
        //2. Logica de la prueba y assert
        ascensor.ejecutarAscensor();
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
        ascensor.ejecutarAscensor();
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
        ascensor.ejecutarAscensor();
        //3. Verificacion o Assert
        assert(ascensor.getPisoActual()==ascensor.getPisoDestino());
    }

}
