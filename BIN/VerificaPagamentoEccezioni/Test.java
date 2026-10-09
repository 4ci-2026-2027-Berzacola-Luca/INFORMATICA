public class Test {
    public static void main(String args []){
        Conto c=new Conto("Mario", 1000.0);
        Pagamento p1=new Pagamento("Centro commerciale", 150.0);
        Pagamento p2=new Pagamento("Negozio di vestiti", 400.0);
        try{
            System.out.println(c.effettuaPagamento(p1));
        }catch(SaldoInsufficienteException e){
            System.out.println("Errore: " + e.getMessage());
        }
        System.out.println();
        try{
            System.out.println(c.effettuaPagamento(p2));
        }catch(SaldoInsufficienteException e){
            System.out.println("Errore: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Saldo rimasto: " + c.getSaldo());
    }
}