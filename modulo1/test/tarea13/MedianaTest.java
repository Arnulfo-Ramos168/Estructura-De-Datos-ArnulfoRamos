package tarea13;

import edu.arnulfo.ramos.tarea13.process.CalculadorMediana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianaTest {
    @Test
    public void testCalcularMediana() {
        int[] valores = {7, 3, 1, 9, 4, 5, 8};
        // La mediana de esta lista de valores es 5.
        double medianaEsperada = 5;

        double medianaCalculada = CalculadorMediana.calcularMediana(valores);

        // Verificar si la mediana calculada es la esperada
        assertEquals(medianaEsperada, medianaCalculada, 0.001);
    }
}
