import java.util.*;
public class Test{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        double epl=0.0;
        double r=0.0;
        double km=0.0;
        double quantita=0.0;
        double euro=0.0;
        Car auto1= new Car();
        DistributoreBenzina distributore= new DistributoreBenzina();
        int scelta=0;

        do { 
            System.out.println("Opzioni:");
            System.out.println("0- Esci");
            System.out.println("1- Inserire prezzo €/l");
            System.out.println("2- Inserire quantità di benzina nel distributore");
            System.out.println("3- Inserire quanti € di benzina fare");
            System.out.println("4- Inserisci la resa dell'auto");
            System.out.println("5- Inserire quanti km percorrere");
            System.out.println("6- Inserisci il nuovo prezzo della benzina €/l");
            System.out.println("7- Vedere il carburante che c'è nel serbatoio dell'auto");
            System.out.println("8- Mostra dati del distributore");
            System.out.println();
            System.out.println("Scegli: ");
            scelta=sc.nextInt();

            switch(scelta){
                case 0:
                    System.out.println("Fine programma");
                    break;
                case 1:
                    System.out.println("Inserisci il prezzo €/l:");
                    epl=sc.nextDouble();
                    distributore.setEuroPerLitro(epl);
                    break;
                case 2:
                    System.out.println("Inserisci la quantità di benzina per il distributore:");
                    quantita=sc.nextDouble();
                    distributore.rifornisci(quantita);
                    break;
                case 3:
                    System.out.println("Inserisci quanti € di benzina vuoi fare:");
                    euro=sc.nextDouble();
                    distributore.vendi(euro, auto1);
                    break;
                case 4:
                    System.out.println("Inserisci la resa dell'auto:");
                    r=sc.nextDouble();
                    auto1.setResa(r);
                    break;
                case 5:
                    System.out.println("Quanti km vuoi percorrere:");
                    km=sc.nextDouble();
                    while(!auto1.drive(km)){
                        System.out.println("Non hai abbastanza benzina. Inserisci di nuovo:");
                        km=sc.nextDouble();
                    }
                    break;
                case 6:
                    System.out.println("Aggiorna prezzo €/l:");
                    epl=sc.nextDouble();
                    distributore.aggiorna(epl);
                    break;
                case 7:
                    System.out.println("Carburante dell'auto: "+auto1.getGas()+" l");
                    break;
                case 8:
                    System.out.println(distributore.toString());
                    break;
                default:
                    System.out.println("Scelta non consentita");
            }
        } while (scelta!=0);
        sc.close();
    }
}