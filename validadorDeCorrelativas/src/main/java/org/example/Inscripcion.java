package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private final List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public boolean aprobo() {
        for (Materia materia : materiasAInscribirse) {
            for (Materia correlativa : materia.correlativas()) {
                if (!alumno.aprobo(correlativa)) {
                    return false;
                }
            }

        }
        return true;
    }
}


