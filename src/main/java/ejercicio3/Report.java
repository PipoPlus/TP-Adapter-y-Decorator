package ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Report implements ExportardorReporte {
    protected String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        // Exportar el reporte a un archivo.
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}