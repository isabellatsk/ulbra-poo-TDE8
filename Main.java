public class Main {
    public static void main(String[] args) {
        Notificacao n = new Notificacao("", "");

        n.enviar();
        n.enviar("Oi!");
        n.enviar("Tudo bemm?", "João");
        n.enviar("Urgente!", "Maria", 5);

        NotificacaoEmail email = new NotificacaoEmail("", "Ana");
        NotificacaoSMS sms = new NotificacaoSMS("", "99999-9999");
        NotificacaoPush push = new NotificacaoPush("", "Carlos");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}