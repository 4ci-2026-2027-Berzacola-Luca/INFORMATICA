public class Conto {
    private String intestatario;
    private double saldo;

    //Costruttore senza parametri
    public Conto(){
        this.intestatario="";
        this.saldo=0.0;
    }
    //Costruttore con parametri
    public Conto(String inte, double sal){
        if(inte != null){
            this.intestatario=inte;
        }else{
            this.intestatario="anonimo";
        }
        if(sal > 0.0){
            this.saldo=sal;
        }else{
            this.saldo=0.0;
        }
    }
    //set
    public void setIntestatario(String inte){
        if(inte != null){
            this.intestatario=inte;
        }else{
            this.intestatario="anonimo";
        }
    }
    public void setSaldo(double sal){
        if(sal > 0.0){
            this.saldo=sal;
        }else{
            this.saldo=0.0;
        }
    }
    //get
    public String getIntestatario(){
        return this.intestatario;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void effettuaPagamento(Pagamento p) throws SaldoInsufficienteException{
        if(p == null){
            throw new IllegalArgumentException("Errore, il pagamento è nullo");
        }
        if(p.getImporto() <= 0.0){
            throw new IllegalArgumentException("Errore, l'importo deve essere maggiore di 0");
        }
        if(p.getImporto() > this.saldo){
            throw new SaldoInsufficienteException("Errore, l'importo è più grande del saldo");
        }
        this.saldo -= p.getImporto();

        System.out.println("Pagamento fatto");
        System.out.println("Beneficiario: " + p.getBeneficiario());
        System.out.println("Importo : " + p.getImporto());
        System.out.println("Saldo rimasto:" + this.saldo);
    }
    //toString
    public String toString(){
        String out="";
        out += "Intestatario: " + this.intestatario;
        out += "\n Saldo: " + this.saldo;
        return out;
    }
}