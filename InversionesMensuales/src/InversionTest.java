import org.junit.Test;

import static org.junit.Assert.*;

public class InversionTest {

    @Test
    public void test1() {
        double salidaEsperada1 = 1268.2418;
        double salidaEsperada2 = 1608.4372;
        double salidaEsperada3 = 2039.8873;
        //Double salidaEsperada4 = 2587.0703;
        double salidaEsperada4 = 2587.0704;
        Inversion inversion = new Inversion(1000, 0.24);
        assertEquals(inversion.calcularInversionMostrarPor(1), salidaEsperada1,4);
        assertEquals(inversion.calcularInversionMostrarPor(2), salidaEsperada2,4);
        assertEquals(inversion.calcularInversionMostrarPor(3), salidaEsperada3,4);
        assertEquals(inversion.calcularInversionMostrarPor(4), salidaEsperada4, 4);
    }

    @Test
    public void test2() {
        Inversion inversion2 = new Inversion(1000,  0.71355714);
        double salidaEsperada1 = 2000.0;
        double salidaEsperada2 = 4000.0001;
        double salidaEsperada3 = 8000.0002;
        double salidaEsperada4 = 16000.0005;
        double salidaEsperada5 = 32000.0012;
        assertEquals(inversion2.calcularInversionMostrarPor(1), salidaEsperada1,4);
        assertEquals(inversion2.calcularInversionMostrarPor(2), salidaEsperada2,4);
        assertEquals(inversion2.calcularInversionMostrarPor(3), salidaEsperada3,4);
        assertEquals(inversion2.calcularInversionMostrarPor(4), salidaEsperada4,4);
        assertEquals(inversion2.calcularInversionMostrarPor(5), salidaEsperada5,4);
    }

    @Test
    public void test3(){
        Inversion inversion = new Inversion(1000,0.07);
        int salidaEsperada = 120;
        assertEquals(inversion.calcularCuantoTiempoEnMesesCon(2000), salidaEsperada);
    }

    @Test
    public void test4(){
        Inversion inversion = new Inversion(1000,0.24);
        int salidaEsperada = 48;
        assertEquals(inversion.calcularCuantoTiempoEnMesesCon(2587), salidaEsperada);
    }
}