package ejercicio3;

import java.io.File;

abstract class DecoradorExportadorReporte implements ExportardorReporte{

    ExportardorReporte exportador;

    public DecoradorExportadorReporte (ExportardorReporte exportador){
        this.exportador = exportador;
    }


    @Override
    public void export(File file) {
        exportador.export(file);
    }
}
