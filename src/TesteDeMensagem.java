import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegreamMessenger;

public class TesteDeMensagem {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "Msn";

        if(appEscolhido.equals("Msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new TelegreamMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
