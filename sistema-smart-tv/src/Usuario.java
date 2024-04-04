public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(15         
        );
        System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual? " + smartTv.volume);


        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Ligada ? " + smartTv.ligada );

        smartTv.desligar();
        System.out.println("Novo Status -> Desligada ? " + smartTv.ligada);

        }
}
