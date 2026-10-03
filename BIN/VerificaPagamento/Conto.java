public class Conto {
    private String intestatario;
    private double saldo;

    //Costruttore senza parametri
    public Conto(){
        this.intestatario="";
        this.saldo=0.0;
    }
    //Costruttore con parametri
    public Conto(String intest, double sal) {
        this.intestatario = intest;
        this.saldo = sal;
    }
    //set
    public void setIntestatario(String i){
        if(i!=null){
            this.intestatario=i;
        }else{
            this.intestatario="anonimo";
        }
    }
    public void setSaldo(double s){
        if(s >= 0.0){
            this.saldo=s;
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
    //metodo effettua pagamento
    public boolean effettuaPagamento(Pagamento pag){
        if(pag != null && pag.getImporto() > 0.0 && pag.getImporto() <= this.saldo){
            this.saldo -= pag.getImporto();
            return true;
        }else{
            return false;
        }
    }
    //toString
    public String toString(){
        String out="";
        out += "Intestatario: " + this.intestatario;
        out += "\n Saldo: " + this.saldo;
        return out;
    }
}
