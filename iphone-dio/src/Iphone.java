import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
       System.out.println("Reprodutor pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
       System.out.println("Música " + musica + " selecionada");
    }

    @Override
    public void ligar(String numero) {
       
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public boolean atender(String atender) {
      
        if (atender.equalsIgnoreCase("sim")) {
            return true;
        }else
        return false;
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
    
}
