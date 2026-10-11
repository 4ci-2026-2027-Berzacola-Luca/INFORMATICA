public class Test {
    public static void main(String args[]){
        Parcheggio p=new Parcheggio(1, 2.50);
        Car c1=new Car("AB123CD", "Fiat");
        Car c2=new Car("EF456GH", "Ford");
        double costo=0.0;

        System.out.println("Inizio: " + p.toString());
        if(p.entra(c1)){
            System.out.println("Auto entrata: " + c1.toString());
            System.out.println("Posti rimasti: " + p.getPostiDisponibili());
        }else{
            System.out.println("Il parcheggio è pieno");
        }
        if(p.entra(c2)){
            System.out.println("Auto entrata: " + c2.toString());
            System.out.println("Posti rimasti: " + p.getPostiDisponibili());
        }else{
            System.out.println("Il parcheggio è pieno");
        }
        System.out.println("Auto uscita: " + c1.toString());
        costo=p.esce(c1, 2.0);
        System.out.println("Costo del parcheggio: " + costo);

        if(p.entra(c2)){
            System.out.println("Auto entrata: " + c2.toString());
            System.out.println("Posti rimasti: " + p.getPostiDisponibili());
        }else{
            System.out.println("Il parcheggio è pieno");
        }
        System.out.println("Fine: " + p.toString());
    }
}
