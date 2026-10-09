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
        if(ben != null){
            this.beneficiario=ben;
        }else{
            this.beneficiario="anonimo";
        }
        if(imp > 0.0){
            this.importo=imp;
        }else{
            this.importo=0.0;
        }
    }
    //set
    public void setBeneficiario(String ben){
        if(ben != null){
            this.beneficiario=ben;
        }else{
            this.beneficiario="anonimo";
        }
    }
    public void setImporto(double imp){
        if(imp > 0.0){
            this.importo=imp;
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
        String out="";
        out += "Beneficiario: " + this.beneficiario;
        out += "\n Importo: " + this.importo;
        return out;
    }
}