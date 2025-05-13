// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocarMusica(String musica);
    void pausarMusica();
    void pararMusica();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void abrirPaginaWeb(String url);
    void fecharPaginaWeb();
}

// Classe iPhone implementando as três interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Página web fechada.");
    }
}

// Classe Main para testar o iPhone
public class Main {
    public static void main(String[] args) {
        // Criando um objeto iPhone
        iPhone iphone = new iPhone();
        
        // Testando Reprodutor Musical
        iphone.tocarMusica("Shape of You - Ed Sheeran");
        iphone.pausarMusica();
        iphone.pararMusica();
        
        // Testando Aparelho Telefônico
        iphone.fazerChamada("987654321");
        iphone.receberChamada("123456789");
        
        // Testando Navegador na Internet
        iphone.abrirPaginaWeb("www.google.com");
        iphone.fecharPaginaWeb();
    }
}
