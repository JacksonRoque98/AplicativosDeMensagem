package apps;

public class TelegreamMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvandoMensagem();
    }
}