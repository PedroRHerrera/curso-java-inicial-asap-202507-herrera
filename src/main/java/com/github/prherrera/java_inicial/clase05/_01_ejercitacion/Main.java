package com.github.prherrera.java_inicial.clase05._01_ejercitacion;

import java.util.List;

public class Main {
	public static void main(String[] args) { // escribir main + (Ctrl + Espacio)
		
		Carrera carrera = new Carrera();
		
		// ===== ALUMNO 1 =====
		Alumno a1 = new Alumno("Juan", "juan@gmail.com");
		Materia m1a = new Materia("Química", "2019-02", EstadoMateria.APROBADA);
		Materia m1b = new Materia("Matemática", "2020-01", EstadoMateria.APROBADA);
		Materia m1c = new Materia("Física", "2020-02", EstadoMateria.EN_CURSO);
		Materia m1d = new Materia("Historia", "2021-01", EstadoMateria.REPROBADA);
		Materia m1e = new Materia("Programación I", "2021-02", EstadoMateria.APROBADA);
		a1.addMateria(m1a);
		a1.addMateria(m1b);
		a1.addMateria(m1c);
		a1.addMateria(m1d);
		a1.addMateria(m1e);
		carrera.addAlumno(a1);

		// ===== ALUMNO 2 =====
		Alumno a2 = new Alumno("María", "maria@gmail.com");
		Materia m2a = new Materia("Biología", "2019-01", EstadoMateria.APROBADA);
		Materia m2b = new Materia("Química", "2019-02", EstadoMateria.APROBADA);
		Materia m2c = new Materia("Álgebra", "2020-01", EstadoMateria.EN_CURSO);
		Materia m2d = new Materia("Geografía", "2020-02", EstadoMateria.REPROBADA);
		Materia m2e = new Materia("Programación II", "2021-01", EstadoMateria.APROBADA);
		a2.addMateria(m2a);
		a2.addMateria(m2b);
		a2.addMateria(m2c);
		a2.addMateria(m2d);
		a2.addMateria(m2e);
		carrera.addAlumno(a2);

		// ===== ALUMNO 3 =====
		Alumno a3 = new Alumno("Pedro", "pedro@gmail.com");
		Materia m3a = new Materia("Historia", "2018-02", EstadoMateria.APROBADA);
		Materia m3b = new Materia("Inglés Técnico", "2019-01", EstadoMateria.APROBADA);
		Materia m3c = new Materia("Programación I", "2019-02", EstadoMateria.EN_CURSO);
		Materia m3d = new Materia("Base de Datos", "2020-01", EstadoMateria.EN_CURSO);
		Materia m3e = new Materia("Sistemas Operativos", "2020-02", EstadoMateria.REPROBADA);
		a3.addMateria(m3a);
		a3.addMateria(m3b);
		a3.addMateria(m3c);
		a3.addMateria(m3d);
		a3.addMateria(m3e);
		carrera.addAlumno(a3);

		// ===== ALUMNO 4 =====
		Alumno a4 = new Alumno("Gonzalo", "gonzalo@gmail.com");
		Materia m4a = new Materia("Programación II", "2018-01", EstadoMateria.APROBADA);
		Materia m4b = new Materia("Redes", "2018-02", EstadoMateria.APROBADA);
		Materia m4c = new Materia("Seguridad Informática", "2019-01", EstadoMateria.EN_CURSO);
		Materia m4d = new Materia("Matemática", "2019-02", EstadoMateria.APROBADA);
		Materia m4e = new Materia("Inteligencia Artificial", "2020-01", EstadoMateria.REPROBADA);
		a4.addMateria(m4a);
		a4.addMateria(m4b);
		a4.addMateria(m4c);
		a4.addMateria(m4d);
		a4.addMateria(m4e);
		carrera.addAlumno(a4);

		// ===== ALUMNO 5 =====
		Alumno a5 = new Alumno("Lucía", "lucia@gmail.com");
		Materia m5a = new Materia("Química", "2018-01", EstadoMateria.APROBADA);
		Materia m5b = new Materia("Física", "2018-02", EstadoMateria.EN_CURSO);
		Materia m5c = new Materia("Programación III", "2019-01", EstadoMateria.EN_CURSO);
		Materia m5d = new Materia("Estadística", "2019-02", EstadoMateria.REPROBADA);
		Materia m5e = new Materia("Análisis de Sistemas", "2020-01", EstadoMateria.APROBADA);
		a5.addMateria(m5a);
		a5.addMateria(m5b);
		a5.addMateria(m5c);
		a5.addMateria(m5d);
		a5.addMateria(m5e);
		carrera.addAlumno(a5);
		
		// ===== getMaxInformeMaxMaterias() =====
		
		List<AlumnoSimplificado> losMejores = carrera.getInformeMaxMaterias();
		
		System.out.println("Ellos son los mejores alumnos de la carrera:");
		
		for (int i = 0; i < losMejores.size(); i++) {
			losMejores.get(i).mostrar();
		}
	}
}
