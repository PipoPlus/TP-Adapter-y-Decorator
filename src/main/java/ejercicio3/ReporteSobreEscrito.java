package ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ReporteSobreEscrito extends DecoradorExportadorReporte {

    public ReporteSobreEscrito(ExportardorReporte exportardorReporte) {
        super(exportardorReporte);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar...");
        }

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(((Report) exportador).reporte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

