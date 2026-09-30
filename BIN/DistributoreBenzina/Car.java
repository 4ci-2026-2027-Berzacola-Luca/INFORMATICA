public class Car{
    private double resa;
    private double quantita;
    public Car(){
        this.resa=0.0;
        this.quantita=0.0;
    }
    public void setResa(double r){
        if(r>0.0){
            this.resa=r;
        }
    }
    public void addGas(double q){
        if(0<q && q<=50){
            this.quantita+=q;
        }
    }
    public boolean drive(double km){
        if(km>0.0 && (km*this.resa)<=this.quantita){
            double litriUsati=km*this.resa;
            this.quantita-=litriUsati;
            return true;
        }else{
            return false;
        }
    }
    public double getGas(){
        return this.quantita;
    }
}