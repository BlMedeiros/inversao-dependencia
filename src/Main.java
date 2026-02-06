//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // 1. Instanciamos as diferentes estratégias de notificação
            NotificationService servicoEmail = new ServicoEmailImpl();
            NotificationService servicoSMS = new ServicoSMSImpl();

            // 2. Usando com E-mail
            RecuperadorDeSenha recuperador = new RecuperadorDeSenha(servicoEmail);
            recuperador.recuperar("usuario@email.com");

            System.out.println("Alternando o serviço.....");

            // Note que não mudamos nada na classe RecuperadorDeSenha.
            recuperador = new RecuperadorDeSenha(servicoSMS);
            recuperador.recuperar("5511999999999");
        }


        }
