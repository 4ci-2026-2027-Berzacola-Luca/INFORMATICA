public class DistributoreBenzina{
    private double deposito;
    private double euroPerLitro;
    public DistributoreBenzina(){
        this.deposito=0.0;
        this.euroPerLitro=0.0;
    }
    public void setEuroPerLitro(double epl){
        if(epl>0.0){
            this.euroPerLitro=epl;
        }
    }
    public void rifornisci(double quantita){
        if(quantita>0.0){
            this.deposito+=quantita;
        }
    }
    public void vendi(double euro, Car Auto){
        double litriRichiesti=euro/this.euroPerLitro;
        if(litriRichiesti <= this.deposito){
            this.deposito-=litriRichiesti;
        }
        Auto.addGas(litriRichiesti);
    }
    public void aggiorna(double epl){
        if(epl>0.0){
            this.euroPerLitro=epl;
        }
    }
    public String toString(){
        String out="";
        out+="Deposito: " + this.deposito;
        out+=" Euro Per Litro: " + this.euroPerLitro;
        return out;
    }
}