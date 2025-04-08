package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Alumno {
    private String nombreA;
    private final List<Materia> materiasAprobadas;

    public Alumno(String nombreA, List<Materia> materiasAprobadas) {
        this.nombreA = nombreA;
        this.materiasAprobadas = materiasAprobadas;
    }
        public boolean aprobo (Materia materia){
      return materiasAprobadas.contains(materia);
        }
    }

