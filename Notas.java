
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Notas {
    public static void main(String[] args) {
        
        HashMap<String, Double> notasEstudiantes = new HashMap<>();
        
        while (true) {
            
            String[] opciones = {
                "Agregar estudiante y asignar nota",
                "Consultar nota de un estudiante",
                "Salir"
            };
            
            int opcionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion:",
                "Registro de Notas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcionSeleccionada) {
                case 0:
                    
                    String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    if (nombreEstudiante != null && !nombreEstudiante.isEmpty()) {
                        String notaEstudianteStr = JOptionPane.showInputDialog("Ingrese la nota del estudiante:");
                        try {
                            double notaEstudiante = Double.parseDouble(notaEstudianteStr);
                            notasEstudiantes.put(nombreEstudiante, notaEstudiante);
                            JOptionPane.showMessageDialog(null, "Nota asignada correctamente.");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Ingrese una nota válida.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre de estudiante no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case 1:
                   
                    String nombreConsulta = JOptionPane.showInputDialog("Ingrese el nombre del estudiante para consultar su nota:");
                    if (nombreConsulta != null && !nombreConsulta.isEmpty()) {
                        Double notaConsulta = notasEstudiantes.get(nombreConsulta);
                        if (notaConsulta != null) {
                            JOptionPane.showMessageDialog(null, "La nota de " + nombreConsulta + " es: " + notaConsulta);
                        } else {
                            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre de estudiante no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;
                    
                default:
                    break;
            }
        }
    }
}
