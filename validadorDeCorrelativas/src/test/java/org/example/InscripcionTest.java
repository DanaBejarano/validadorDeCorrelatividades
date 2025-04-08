package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionTest {

    @Test
    public void inscripcionEsAprobadaSiCumpleCorrelativas() {
        Materia algoritmos = new Materia("Algoritmos", Collections.emptyList());
        Materia paradigmas = new Materia("Paradigmas", Arrays.asList(algoritmos));
        Materia diseno = new Materia("Diseño", Arrays.asList(paradigmas));

        Alumno alumno = new Alumno("Dana", Arrays.asList(algoritmos, paradigmas,diseno));

        Inscripcion inscripcion = new Inscripcion(alumno, Arrays.asList(diseno));

        assertTrue(inscripcion.aprobo());
    }
}