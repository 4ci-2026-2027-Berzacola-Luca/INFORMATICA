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
        if(euro/this.euroPerLitro <= this.deposito){
            this.deposito-=(euro/this.euroPerLitro);
        }
        Auto.addGas(euro/this.euroPerLitro);
    }
    public void aggiorna(double epl){
        if(epl>0.0){
            this.euroPerLitro=epl;
        }
    }
    public String toString(){
        return "Deposito: " + this.deposito + "Euro per litro: " + this.euroPerLitro;
    }
}