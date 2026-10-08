public class Notificacao {
    private String mensagem;
    private String destinatario;

    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public void enviar() {
        System.out.println("Enviando notificação.");
    }

    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }

    public void enviar(String mensagem, String destinatario) {
        System.out.println(mensagem + " - " + destinatario);
    }

    public void enviar(String mensagem, String destinatario, int prioridade) {
        System.out.println(mensagem + " - " + destinatario + " - Prioridade: " + prioridade);
    }

    public String getDestinatario() {
        return destinatario;
    }
}