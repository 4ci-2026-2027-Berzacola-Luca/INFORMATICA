package BIN.VideoNoleggio;

public class Film {
    private String titolo;
    private String regista;
    private boolean disponibile;

    //Costruttore vuoto
    public Film(){
        this.titolo="Titolo sconosciuto";
        this.regista="Regista sconosciuto";
        this.disponibile=true;
    }

    //Costruttore con parametri
    public Film(String tit, String reg){
        setTitolo(tit);
        setRegista(reg);
        this.disponibile=true;
    }

    //Costruttore copia
    public Film(Film f){
        if(f == null){
            throw new IllegalArgumentException("Film da copiare non può essere null");
        }
        this.titolo=f.titolo;
        this.regista=f.regista;
        this.disponibile=f.disponibile;
    }

    //Metodo set
    public void setTitolo(String tit){
        if(tit==null || tit.trim().isEmpty()){
            throw new IllegalArgumentException("Titolo non può essere nullo o vuoto");
        }
        this.titolo=tit.trim();
    }
    public void setRegista(String reg){
        if(reg==null || reg.trim().isEmpty()){
            throw new IllegalArgumentException("Regista non può essere nullo o vuoto");
        }
        this.regista=reg.trim();
    }

    //Metodo get
    public String getTitolo(){
        return this.titolo;
    }
    public String getRegista(){
        return this.regista;
    }
    public boolean isDisponibile(){
        return this.disponibile;
    }

    //Metodo noleggia
    public void noleggia(){
        if(!this.disponibile){
            throw new IllegalStateException("Film non disponibile");
        }
        this.disponibile=false;
    }

    //Metodo restituisci
    public void restituisci(){
        if(this.disponibile){
            throw new IllegalStateException("Film già disponibile");
        }
        this.disponibile=true;
    }
}