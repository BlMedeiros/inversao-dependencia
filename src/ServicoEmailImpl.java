class ServicoEmailImpl implements NotificationService {

    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando E-mail SMTP: " + mensagem);
    }
}