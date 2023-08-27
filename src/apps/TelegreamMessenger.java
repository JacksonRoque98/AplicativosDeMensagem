package apps;

public class TelegreamMessenger extends ServicoMensagemInstantanea{
//@Override significa sobre-escrever o metodo que vem da classe ServicoMensagemInstantanea
    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
//@Override significa sobre-escrever o metodo que vem da classe ServicoMensagemInstantanea
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvandoMensagem();
    }
}