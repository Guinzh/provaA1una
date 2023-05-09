import java.util.Scanner;

public class QuestaoUmA1kmPorHora {
    
    public static void main(String[] args) {

        System.out.println("Questão um, prova A1, viagem combustivel km por hora .");
        

        Scanner scan = new Scanner(System.in);

        // placa do veiculo 

        System.out.println("Entre com a placa do veículo:");
        String placaVeiculo = scan.nextLine();

        // valor da da gasolina

        System.out.println("Entre com o valor do litro do combustível:5");
        double valorcombustivel = scan.nextDouble();

        //quilometragem rodada

        System.out.println("Entre com a quantidade de quilômetros rodados a 60 KM/H:");
        double sessentaporhora = scan.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 80 KM/H:");
        double oitentaporhora = scan.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 100 KM/H:");
        double cemporhora = scan.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 120 KM/H:");
        double centoevintePorhora = scan.nextDouble();

        System.out.println("entre com a quantidade de quilômetros rodados a 140 KM/H:");
        double centoequarentaporhora = scan.nextDouble();

        //consumo por quilometragem por hora

        double consumosessentaPorHora = (sessentaPorHora / 30.7);
        double consumoOitentaPorHora = (oitentaPorHora / 26.8);
        double consumoCemPorHora = (cemPorHora / 22.4);
        double consumoCentoEVintePorHora = (centoEVintePorHora / 18.1);
        double consumoCentoEQuarentaPorHora = (centoEQuarentaPorHora / 14.5);

        //total consumo por hora

        double consumoTotal = (consumosessentaPorHora + consumoOitentaPorHora + consumoCemPorHora
                + consumoCentoEVintePorHora + consumoCentoEQuarentaPorHora);

        double mediaPoderada = ((sessentaPorHora * 60) + (oitentaPorHora * 80) + (cemPorHora * 100)
                + (centoEVintePorHora * 120) + (centoEQuarentaPorHora * 140))
                / (sessentaPorHora + oitentaPorHora + cemPorHora + centoEVintePorHora + centoEQuarentaPorHora);

        double custoTotal = (consumoTotal * valorCombustivel);

        // teste total  

        System.out.printf("Placa do veículo: %s", placaVeiculo);
        System.out.printf("Consumo total: %.4f litros", consumoTotal);
        System.out.printf("Valor total: R$ %.2f", custoTotal);
        System.out.printf("Velocidade média ponderada: %.4f Km/h", mediaPoderada);

        scan.close();
    }
}
    
