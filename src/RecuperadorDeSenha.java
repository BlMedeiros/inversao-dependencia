public class RecuperadorDeSenha {

    private NotificationService notificationService;

    public RecuperadorDeSenha(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void recuperar(String email) {
        String link = "http: /techstore.com/reset?token=123";
        notificationService.enviarEmail("Clique no link para resetar sua senha: " +
                link);
    }
}