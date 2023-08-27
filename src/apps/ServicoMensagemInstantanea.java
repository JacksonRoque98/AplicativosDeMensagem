package apps;

//POLIMORFISMO
//Uma classe abstrada, pode possuir metodos abstratos ou metodos com estrutura.
public abstract class ServicoMensagemInstantanea {

    //Metodos abstratos que não possuem corpo/complemento, precisam ser instanciados por
    //outras classes e ser construida de acordo com o que irá retornar.
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //metodos com estrutura que podem ser usados em outras classes
    //protected irá deixar o metodo visivel somente para as classes que estejam
    //sendo extendidas.
    protected void verificarConexaoInternet(){
        System.out.println("Verificando conexão com a internet...");
        System.out.println("Conexão OK!");
    }
    protected void salvandoMensagem() {
        System.out.println("Verificando todas as mensagens...");
        System.out.println("SALVANDO HISTORICO DE CONVERSA!");
    }
}
