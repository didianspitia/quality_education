package org.didian.quality_education;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estadisticas {
    private final List<Persona> personas;

    public Estadisticas(List<Persona> personas) {
        this.personas = personas;
    }

    public double calcularMediaAccesoSuperior() {
        int totalPersonas = personas.size();
        int contadorSi = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior())) {
                contadorSi++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorSi / totalPersonas;
        } else {
            return 0.0;
        }
    }

    public String calcularMedianaAccesoSuperior() {
        int totalPersonas = personas.size();
        if (totalPersonas == 0) {
            return "N/A";
        }

        String[] accesoSuperiorArray = new String[totalPersonas];

        for (int i = 0; i < totalPersonas; i++) {
            accesoSuperiorArray[i] = personas.get(i).getAccesoSuperior();
        }

        // Ordena el array
        Arrays.sort(accesoSuperiorArray);

        if (totalPersonas % 2 == 0) {
            int middle1 = totalPersonas / 2 - 1;
            int middle2 = totalPersonas / 2;
            return accesoSuperiorArray[middle1] + ", " + accesoSuperiorArray[middle2];
        } else {
            int middle = totalPersonas / 2;
            return accesoSuperiorArray[middle];
        }
    }

    public String calcularModaAccesoSuperior() {
        if (personas.isEmpty()) {
            return "N/A";
        }

        Map<String, Integer> countMap = new HashMap<>();

        for (Persona persona : personas) {
            String accesoSuperior = persona.getAccesoSuperior();
            countMap.put(accesoSuperior, countMap.getOrDefault(accesoSuperior, 0) + 1);
        }

        String moda = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                moda = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return moda;
    }

    // Métodos para calcular los porcentajes
    public double calcularPorcentajeAccesoSuperiorSi() {
        int totalPersonas = personas.size();
        int contadorSi = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior())) {
                contadorSi++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorSi / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeAccesoSuperiorNo() {
        int totalPersonas = personas.size();
        int contadorNo = 0;

        for (Persona persona : personas) {
            if ("no".equalsIgnoreCase(persona.getAccesoSuperior())) {
                contadorNo++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorNo / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeHombresConAccesoSuperior() {
        int totalPersonas = personas.size();
        int contadorHombresConAcceso = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior()) && "Masculino".equalsIgnoreCase(persona.getGenero())) {
                contadorHombresConAcceso++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorHombresConAcceso / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeMujeresConAccesoSuperior() {
        int totalPersonas = personas.size();
        int contadorMujeresConAcceso = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior()) && "Femenino".equalsIgnoreCase(persona.getGenero())) {
                contadorMujeresConAcceso++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorMujeresConAcceso / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeHombresSinAccesoSuperior() {
        int totalPersonas = personas.size();
        int contadorHombresSinAcceso = 0;

        for (Persona persona : personas) {
            if ("no".equalsIgnoreCase(persona.getAccesoSuperior()) && "Masculino".equalsIgnoreCase(persona.getGenero())) {
                contadorHombresSinAcceso++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorHombresSinAcceso / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeMujeresSinAccesoSuperior() {
        int totalPersonas = personas.size();
        int contadorMujeresSinAcceso = 0;

        for (Persona persona : personas) {
            if ("no".equalsIgnoreCase(persona.getAccesoSuperior()) && "Femenino".equalsIgnoreCase(persona.getGenero())) {
                contadorMujeresSinAcceso++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorMujeresSinAcceso / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeModalidadPresencial() {
        int contadorSi = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior())) {
                contadorSi++;
            }
        }int contadorPresencial = 0;

        for (Persona persona : personas) {
            if ("presencial".equalsIgnoreCase(persona.getModalidad())) {
                contadorPresencial++;
            }
        }
        if (contadorSi > 0) {
            return (double) contadorPresencial / contadorSi * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeModalidadVirtual() {
        int contadorSi = 0;

        for (Persona persona : personas) {
            if ("si".equalsIgnoreCase(persona.getAccesoSuperior())) {
                contadorSi++;
            }
        }
        int contadorVirtual = 0;

        for (Persona persona : personas) {
            if ("Remota".equalsIgnoreCase(persona.getModalidad())) {
                contadorVirtual++;
            }
        }
        if (contadorSi > 0) {
            return (double) contadorVirtual / contadorSi * 100.0;
        } else {
            return 0.0;
        }
    }
    public double calcularPorcentajeEstrato1a2() {
        int totalPersonas = personas.size();
        int contadorEstrato1a2 = 0;

        for (Persona persona : personas) {
            int estrato = persona.getNivelSocioeconomico();
            if (estrato >= 1 && estrato <= 2) {
                contadorEstrato1a2++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorEstrato1a2 / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeEstrato3a4() {
        int totalPersonas = personas.size();
        int contadorEstrato3a4 = 0;

        for (Persona persona : personas) {
            int estrato = persona.getNivelSocioeconomico();
            if (estrato >= 3 && estrato <= 4) {
                contadorEstrato3a4++;
            }
        }

        if (totalPersonas > 0) {
            return (double) contadorEstrato3a4 / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }

    public double calcularPorcentajeEstrato5a6() {
        int totalPersonas = personas.size();
        int contadorEstrato5a6 = 0;

        for (Persona persona : personas) {
            int estrato = persona.getNivelSocioeconomico();
            if (estrato >= 5 && estrato <= 6) {
                contadorEstrato5a6++;
            }
        }
        if (totalPersonas > 0) {
            return (double) contadorEstrato5a6 / totalPersonas * 100.0;
        } else {
            return 0.0;
        }
    }
}