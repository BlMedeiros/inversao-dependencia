public class ServicoSMSImpl implements NotificationService{

    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
