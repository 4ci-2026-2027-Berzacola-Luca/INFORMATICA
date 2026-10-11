public class Car {
    private String targa;
    private String modello;
    // Costruttore senza paramentri
    public Car(){
        this.targa="";
        this.modello="";
    }
    // Costruttore con parametri
    public Car(String t, String m){
        if(t != null){
            this.targa=t;
        }else{
            this.targa="anonimo";
        }
        if(m != null){
            this.modello=m;
        }else{
            this.modello="anonimo;"
        }
    }
    //set
    public void setTaga(String t){
        if(t != null){
            this.targa=t;
        }else{
            this.targa="anonimo";
        }
    }
    public void setModello(String m){
        if(m != null){
            this.modello=m;
        }else{
            this.modello="anonimo";
        }
    }
    //get
    public String getTarga(){
        return this.targa;
    }
    public String getModello(){
        return this.modello;
    }
    //toString
    public String toString(){
        String out="";
        out+="Targa: " + this.targa;
        out+="\nModello: " + this.modello;
        return out;
    }
}
