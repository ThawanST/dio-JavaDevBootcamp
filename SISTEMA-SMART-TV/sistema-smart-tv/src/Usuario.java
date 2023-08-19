public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(81);
        System.out.println("Novo canal -> Canal atual : " + smartTv.canal);

        smartTv.mudarVolume(38);
        System.out.println("Novo canal -> Canal atual : " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

    }
}
