public class Parcheggio {
    private int postiDisponibili;
    private double costoOrario;
    // Costruttore senza parametri
    public Parcheggio(){
        this.postiDisponibili=0;
        this.costoOrario=0.0;
    }
    // Costruttore con parametri
    public Parcheggio(int pd, double co){
        if(pd >= 0){
            this.postiDisponibili=pd;
        }else{
            this.postiDisponibili=0;
        }
        if(co >= 0.0){
            this.costoOrario=co;
        }else{
            this.costoOrario=0.0;
        }
    }
    //set
    public void setPostiDisponibili(int pd){
        if(pd >= 0){
            this.postiDisponibili=pd;
        }else{
            this.postiDisponibili=0;
        }
    }
    public void setCostoOrario(double co){
        if(co >= 0.0){
            this.costoOrario=co;
        }else{
            this.costoOrario=0.0;
        }
    }
    //get
    public int getPostiDisponibili(){
        return this.postiDisponibili;
    }
    public double getCostoOrario(){
        return this.costoOrario;
    }

    //metodo entra
    public boolean entra(Car auto){
        if(this.postiDisponibili > 0){
            this.postiDisponibili--;
            return true;
        }else{
            return false;
        }
    }
    //metodo esci
    public double esce(Car auto, double ore){
        double costo=0.0;
        if(auto != null && ore > 0.0){
            this.postiDisponibili++;
            costo=ore*this.costoOrario;
            return costo;
        }else{
            costo=0.0;
            return costo;
        }
    }
    //set per aggiornare il costo orario
    public void setCosto(double co){
        if(co >= 0.0){
            this.costoOrario=co;
        }else{
            this.costoOrario=0.0;
        }
    }

    //toString
    public String toString(){
        String out="";
        out+="Posti disponibili: " + this.postiDisponibili;
        out+="\nCosto orario: " + this.costoOrario + "€";
        return out;
    }
}
