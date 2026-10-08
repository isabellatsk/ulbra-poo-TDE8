public class NotificacaoPush extends Notificacao {
    public NotificacaoPush(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando push para " + getDestinatario());
    }
}