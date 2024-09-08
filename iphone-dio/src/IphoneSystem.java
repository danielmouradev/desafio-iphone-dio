public class IphoneSystem {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        System.out.println("\nREPRODUTOR MUSICAL");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Só fé");

        System.out.println("\nAPARELHO TELEFÔNICO");
        System.out.println(iphone.atender("sim"));
        iphone.ligar("(83) 98717-4738");
        iphone.iniciarCorreioDeVoz(); 

        System.out.println("\nNAVEGADOR DE INTERNET");
        iphone.exibirPagina();
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();
    }
}
