package funcionalidades;

public class IphoneFuncoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

}
