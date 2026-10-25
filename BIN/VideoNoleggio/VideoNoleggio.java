package BIN.VideoNoleggio;

public class VideoNoleggio {
    private String nome;
    private int numeroFilmDisponibili;

    //Costruttore vuoto
    public VideoNoleggio(){
        setNome("anonimo");
        setNumeroFilmDisponibili(0);
    }

    //Costruttore con parametri
    public VideoNoleggio(String n, int numF){
        setNome(n);
        setNumeroFilmDisponibili(numF);
    }

    //Costruttore copia
    public VideoNoleggio(VideoNoleggio v){
        if(v==null){
            throw new IllegalArgumentException("Video noleggio non può essere nullo");
        }
        setNome(v.nome);
        setNumeroFilmDisponibili(v.numeroFilmDisponibili);
    }

    //Metodi set
    public String setNome(String n){
        if(n==null || n.trim().isEmpty()){
            throw new IllegalArgumentException("Il nome del video noleggio non può essere nullo o vuoto");
        }
        this.nome=n.trim();
    }
    public int setNumeroFilmDisponibili(int numF){
        if(numF<0){
            throw new IllegalArgumentException("Il numero di film disponibili non può essere minore di 0");
        }
        this.numeroFilmDisponibili=numF;
    }

    //Metodi get
    public String getNome(){
        return this.nome;
    }
    public int getNumeroFilmDisponibili(){
        return this.numeroFilmDisponibili;
    }

    //Metodo noleggiare un film
    public void noleggiaFilm(Film f){
        if(f==null){
            throw new IllegalArgumentException("Il film non può essere vuoto");
        }
        if(this.numeroFilmDisponibili==0){
            throw new IllegalStateException("Non ci sono film disponibili");
        }
        f.noleggia();
        this.numeroFilmDisponibili--;
    }

    //Metodo restituire un film
    public void restituisciFilm(Film f){
        if(f==null){
            throw new IllegalArgumentException("Il film non può essere vuoto");
        }
        f.restituisci();
        this.numeroFilmDisponibili++;
    }

    //Metodo visualizza stato
    public String visualizzaStato(Film f){
        String out="";
        if(f==null){
            throw new IllegalArgumentException("Il film non può essere vuoto");
        }
        out+="Videonoleggio: " + this.nome;
        out+="\nTitolo: " + f.getTitolo();
        out+="\nRegista: " + f.getRegista();
        if(f.isDisponibile()){
            out+="\nStato: disponibile";
        }else{
            out+="\nStato: non disponibile";
        }
        out+="\nNumero film disponibili: " + this.numeroFilmDisponibili;
        return out;
    }
}
