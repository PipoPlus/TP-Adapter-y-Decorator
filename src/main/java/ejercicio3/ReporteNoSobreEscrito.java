package ejercicio3;

import java.io.File;

class ReporteNoSobreEscrito extends DecoradorExportadorReporte {

    public ReporteNoSobreEscrito(ExportardorReporte decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void export(File file) {
        exportador.export(file);
    }
}
