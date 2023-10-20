package org.didian.quality_education;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        // Agregar personas a la lista
        personas.add(new Persona("Daniel", "Jaramillo", 23, "Masculino", 2, "si", "Publica", "presencial", null));
        personas.add(new Persona("Ana", "Jiménez", 17, "Femenino", 2, "no", null, null, "Economico"));
        personas.add(new Persona("Luis", "García", 20, "Masculino", 3, "si", "Publica", "presencial", null));
        personas.add(new Persona("Andrea", "Fernández", 21, "Femenino", 3, "si", "Privada", "presencial", null));
        personas.add(new Persona("Juan", "Pérez", 25, "Masculino", 2, "si", "Publica", "Remota", null));
        personas.add(new Persona("Sofía", "González", 19, "Femenino", 5, "si", "Pública", "Remota", null));
        personas.add(new Persona("Luis", "Hernández", 22, "Masculino", 1, "no", null, null, "economico"));
        personas.add(new Persona("Ana", "Martínez", 26, "Femenino", 2, "no", null, null, "economico"));
        personas.add(new Persona("Daniel", "Rodríguez", 21, "Masculino", 4, "si", "Privada", "presencial", null));
        personas.add(new Persona("Andrea", "García", 24, "Femenino", 6, "si", "Pública", "Remota", null));
        personas.add(new Persona("Juan", "Martínez", 18, "Masculino", 6, "si", "Pública", "Remota", null));
        personas.add(new Persona("Laura", "Pérez", 18, "Femenino", 2, "no", null, null, "Economicomico"));
        personas.add(new Persona("Carlos", "Jiménez", 20, "Masculino", 3, "si", "Pública", "presencial", null));
        personas.add(new Persona("Sofía", "González", 25, "Femenino", 2, "no", null, null, "Personal"));
        personas.add(new Persona("Felipe", "Jaramillo", 23, "Masculino", 2, "si", "Publica", "presencial", null));
        personas.add(new Persona("Andres", "Jiménez", 17, "Masculino", 6, "no", null, null, "Economico"));
        personas.add(new Persona("Camilo", "García", 20, "Masculino", 3, "si", "Publica", "presencial", null));
        personas.add(new Persona("Kevin", "Fernández", 21, "Masculino", 3, "si", "Privada", "presencial", null));
        personas.add(new Persona("Julian", "Pérez", 25, "Masculino", 2, "si", "Publica", "Remota", null));
        personas.add(new Persona("Sandra", "González", 19, "Femenino", 5, "si", "Pública", "Remota", null));
        personas.add(new Persona("Luisa", "Hernández", 22, "Femenino", 1, "no", null, null, "economico"));
        personas.add(new Persona("Angela", "Martínez", 26, "Femenino", 2, "no", null, null, "economico"));
        personas.add(new Persona("Denis", "Rodríguez", 21, "Femenino", 4, "si", "Privada", "presencial", null));
        personas.add(new Persona("Anna", "García", 24, "Femenino", 6, "si", "Pública", "Presencial", null));
        personas.add(new Persona("Juan", "Martínez", 18, "Masculino", 6, "si", "Pública", "presencial", null));
        personas.add(new Persona("Lorena", "Pérez", 18, "Femenino", 2, "no", null, null, "Economicomico"));
        personas.add(new Persona("Camila", "Jiménez", 20, "Femenino", 3, "si", "Pública", "Remota", null));
        personas.add(new Persona("Zara", "González", 25, "Femenino", 2, "no", null, null, "Personal"));

        // Imprimir la información de las personas
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Imprimir encabezados
        System.out.println("\n---------------LISTAS PERSONAS ENCUESTADAS--------------\n");
        System.out.format("%-17s%-17s%-10s%-12s%-22s%-17s%-22s%-17s%-12s%n",
                "Nombre", "Apellido", "Edad", "Género", "Nivel Socioeconómico", "Acceso Superior", "Tipo de Institución", "Modalidad", "Motivo"
        );

        // Imprimir registros de datos
        for (Persona persona : personas) {
            System.out.format("%-17s%-17s%-10s%-12s%-22s%-17s%-22s%-17s%-12s%n",
                    persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getGenero(),
                    persona.getNivelSocioeconomico(), persona.getAccesoSuperior(), persona.getTipoInstitucion(),
                    persona.getModalidad(), persona.getMotivo()
            );
        }
        Estadisticas estadisticas = new Estadisticas(personas);

        // Calcular y mostrar estadísticas
        double mediaAccesoSuperior = estadisticas.calcularMediaAccesoSuperior();
        String medianaAccesoSuperior = estadisticas.calcularMedianaAccesoSuperior();
        String modaAccesoSuperior = estadisticas.calcularModaAccesoSuperior();

        // Otros cálculos de porcentajes
        double porcentajeAccesoSuperiorSi = estadisticas.calcularPorcentajeAccesoSuperiorSi();
        double porcentajeAccesoSuperiorNo = estadisticas.calcularPorcentajeAccesoSuperiorNo();
        double porcentajeHombresConAccesoSuperior = estadisticas.calcularPorcentajeHombresConAccesoSuperior();
        double porcentajeMujeresConAccesoSuperior = estadisticas.calcularPorcentajeMujeresConAccesoSuperior();
        double porcentajeHombresSinAccesoSuperior = estadisticas.calcularPorcentajeHombresSinAccesoSuperior();
        double porcentajeMujeresSinAccesoSuperior = estadisticas.calcularPorcentajeMujeresSinAccesoSuperior();
        double porcentajeModalidadPresencial = estadisticas.calcularPorcentajeModalidadPresencial();
        double porcentajeModalidadVirtual = estadisticas.calcularPorcentajeModalidadVirtual();
        double porcentajeEstrato1a2 = estadisticas.calcularPorcentajeEstrato1a2();
        double porcentajeEstrato3a4 = estadisticas.calcularPorcentajeEstrato3a4();
        double porcentajeEstrato5a6 = estadisticas.calcularPorcentajeEstrato5a6();

        // Imprimir resultados
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Media de Acceso Superior: " + mediaAccesoSuperior);
        System.out.println("Mediana de Acceso Superior: " + medianaAccesoSuperior);
        System.out.println("Moda de Acceso Superior: " + modaAccesoSuperior);

        System.out.println("\n--- Porcentajes ---");
        System.out.println("Porcentaje de Personas con Acceso Superior 'Si': " + porcentajeAccesoSuperiorSi + "%");
        System.out.println("Porcentaje de Personas con Acceso Superior 'No': " + porcentajeAccesoSuperiorNo + "%");
        System.out.println("\nPorcentaje de Hombres con Acceso Superior: " + porcentajeHombresConAccesoSuperior + "%");
        System.out.println("Porcentaje de Mujeres con Acceso Superior: " + porcentajeMujeresConAccesoSuperior + "%");
        System.out.println("Porcentaje de Hombres sin Acceso Superior: " + porcentajeHombresSinAccesoSuperior + "%");
        System.out.println("Porcentaje de Mujeres sin Acceso Superior: " + porcentajeMujeresSinAccesoSuperior + "%");
        System.out.println("\nPorcentaje de Modalidad 'Presencial': " + porcentajeModalidadPresencial + "%");
        System.out.println("Porcentaje de Modalidad 'Remota': " + porcentajeModalidadVirtual + "%");
        System.out.println("\nPorcentaje de Estrato 1 a 2: " + porcentajeEstrato1a2 + "%");
        System.out.println("Porcentaje de Estrato 3 a 4: " + porcentajeEstrato3a4 + "%");
        System.out.println("Porcentaje de Estrato 5 a 6: " + porcentajeEstrato5a6 + "%");
    }
}