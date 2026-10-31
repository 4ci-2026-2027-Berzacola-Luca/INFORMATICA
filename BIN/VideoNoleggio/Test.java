package BIN.VideoNoleggio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Film film=null;
        try {
            File f=new File("film.txt");
            Scanner inp=new Scanner(f);
            if(!inp.hasNextLine()){
                throw new Exception("Il file di input non contiene il titolo");
            }
            String tit=inp.nextLine();
            if(!inp.hasNextLine()){
                throw new Exception("Il file di input non contiene il regista");
            }
            String reg=inp.nextLine();
            film=new Film(tit, reg);

            //Creazione videonoleggio
            VideoNoleggio video;
            video=new VideoNoleggio("Video Center", 15);

            System.out.println("STATO INIZIALE:");
            System.out.println(video.visualizzaStato(film));

            video.noleggiaFilm(film);

            System.out.println("STATO DOPO IL NOLEGGIO:");
            System.out.println(video.visualizzaStato(film));

            //Scrittura dei dati nel file noleggi.txt
            PrintWriter writer=new PrintWriter("noleggi.txt");
            writer.println("Videonoleggio: " + video.getNome());
            writer.println("Titolo: " + film.getTitolo());
            writer.println("Regista :" + film.getRegista());
            if(film.isDisponibile()){
                writer.println("Stato: disponibile");
            }else{
                writer.println("Stato: noleggiato");
            }
            writer.println("Film disponibili: " + video.getNumeroFilmDisponibili());
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Il file non trovato:"+e.getMessage());
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Errore: "+e.getMessage());
        }
    }
}
