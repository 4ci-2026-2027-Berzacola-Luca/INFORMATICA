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
        
        System.out.println("Inserisci il prezzo €/l: ");
        epl=sc.nextDouble();
        distributore.setEuroPerLitro(epl);
        
        System.out.println("Inserisci la quantità di benzina per il distributore: ");
        quantita=sc.nextDouble();
        distributore.rifornisci(quantita);
        
        System.out.println("Inserisci quanti euro di benzina vuoi fare: ");
        euro=sc.nextDouble();
        distributore.vendi(euro, auto1);
        System.out.println("Inserisci la resa dell'auto: ");
        r=sc.nextDouble();
        auto1.setResa(r);
        System.out.println("Inserisci i km da percorrere: ");
        km=sc.nextDouble();
        auto1.drive(km);
        System.out.println("Carburate: "+ auto1.getGas() + " l");
        System.out.println("Inserisci il nuovo prezzo €/l: ");
        epl=sc.nextDouble();
        distributore.aggiorna(epl);
        System.out.println(distributore.toString());
        sc.close();
    }
}
