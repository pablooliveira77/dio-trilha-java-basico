public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades do iPhone
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Minha Música Favorita");

        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
