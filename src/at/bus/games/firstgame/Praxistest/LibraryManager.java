package at.bus.games.firstgame.Praxistest;

import at.bus.games.firstgame.Probetest.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Books> books = new ArrayList<Books>();

    void getAllMedia(){
        for(Books books: books){
            System.out.println(books.getid() + ":" + books.getTitel());
        }
    }

    void calculateTotalMediaValue(){
        for (Books books :this.books) {
            System.out.println("hallo");
        }
    }


}