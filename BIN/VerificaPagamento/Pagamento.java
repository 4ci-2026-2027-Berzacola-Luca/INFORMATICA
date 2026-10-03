public class Pagamento {
    private String beneficiario;
    private double importo;

    //Costruttore senza parametri
    public Pagamento(){
        this.beneficiario="";
        this.importo=0.0;
    }
    //Costruttore con parametri
    public Pagamento(String ben, double imp){
        this.beneficiario = ben;
        this.importo = imp;
    }
    //set
    public void setBeneficiario(String b){
        if(b != null){
            this.beneficiario=b;
        }else{
            this.beneficiario="anonimo";
        }
    }
    public void setImporto(double i){
        if(i > 0.0){
            this.importo=i;
        }else{
            this.importo=0.0;
        }
    }
    //get
    public String getBeneficiario(){
        return this.beneficiario;
    }
    public double getImporto(){
        return this.importo;
    }
    //toString
    public String toString(){
        String out = "";
        out += "Beneficiario: " + this.beneficiario;
        out += "\n Importo: " + this.importo;
        return out;
    }
}