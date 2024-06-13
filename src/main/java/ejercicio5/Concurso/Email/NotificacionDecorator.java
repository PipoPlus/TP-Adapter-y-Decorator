package ejercicio5.Concurso.Email;

public class NotificacionDecorator implements EnvioMail{

    EnvioMail envioMail;
    public NotificacionDecorator(EnvioMail envioMail){
        this.envioMail = envioMail;
    }


    @Override
    public void enviarNotificacion(String destinatario, String nombreConcurso) {
        envioMail.enviarNotificacion(destinatario, nombreConcurso);
    }
}
