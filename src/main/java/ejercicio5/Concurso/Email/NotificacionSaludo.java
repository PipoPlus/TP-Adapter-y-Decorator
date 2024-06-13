package ejercicio5.Concurso.Email;


public class NotificacionSaludo extends NotificacionDecorator{

    private static final String USERNAME = "21e60c54fcf1b9";
    private static final String PASSWORD = "4f38f702e543b0";
    private static final String HOST = "sandbox.smtp.mailtrap.io";

    public NotificacionSaludo(EnvioMail envioMail) {
        super(envioMail);
    }

    @Override
    public void enviarNotificacion(String destinatario, String nombreConcurso) {
        super.enviarNotificacion(destinatario, nombreConcurso);
        enviarNotificacionDeSeguimiento(destinatario,nombreConcurso);
    }

    private void enviarNotificacionDeSeguimiento(String destinatario, String nombreConcurso) {
        System.out.println("Enviando notificación de seguimiento a " + destinatario + " para el concurso " + nombreConcurso);
    }
}
