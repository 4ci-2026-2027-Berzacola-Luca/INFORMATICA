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
        if(q>0.0){
            this.quantita+=q;
        }
    }
    public void drive(double km){
        if(km>0.0 && (km*this.resa)<=this.quantita){
            this.quantita-=(km*this.resa);
        }
    }
    public double getGas(){
        return this.quantita;
    }
}