import java.util.*;
public class Test {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String intest="";
        String benef="";
        double sal=0.0;
        double imp=0.0;

        Conto con= new Conto();
        Pagamento pag= new Pagamento();
        int scelta=0;
        do{
            System.out.println("Opzioni:");
            System.out.println("0- Esci");
            System.out.println("1- Inserisci intestatario del conto");
            System.out.println("2- Inserisci il saldo nel conto");
            System.out.println("3- Imposta un pagamento inserendo beneficiario e importo");
            System.out.println("4- Effettua il pagamento importato");
            System.out.println("5- Mostra dati del conto");
            System.out.println("6- Mostra dati dell'ultimo pagamento");
            System.out.println("\n Scegli: ");
            scelta=sc.nextInt();
            sc.nextLine();

            switch(scelta){
                case 0:
                    System.out.println("Fine del programma");
                    break;
                case 1:
                    System.out.println("Inserisci l'intestatario:");
                    intest=sc.nextLine();
                    con.setIntestatario(intest);
                    break;
                case 2:
                    System.out.println("Inserisci l'importo da mettere nel saldo:");
                    sal=sc.nextDouble();
                    con.setSaldo(con.getSaldo()+sal);
                    break;
                case 3:
                    System.out.println("Inserisci il beneficiario:");
                    benef=sc.nextLine();
                    System.out.println("Inserisci l'importo del pagamento:");
                    imp=sc.nextDouble();
                    pag.setBeneficiario(benef);
                    pag.setImporto(imp);
                    break;
                case 4:
                    if(con.effettuaPagamento(pag)){
                        System.out.println("Pagamento eseguito");
                    }else{
                        System.out.println("Pagamento fallito, il saldo è iinsufficiente o dati non validi");
                    }
                    break;
                case 5:
                    System.out.println(con.toString());
                    break;
                case 6:
                    System.out.println(pag.toString());
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }while(scelta!=0);
    }
}
