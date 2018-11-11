package hillel.com.beans;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Storage {

    public Storage() {
        bookList.add(new FantasyBook("LORT"));
        bookList.add(new FantasyBook("Harry Potter"));
        bookList.add(new ScienceBook("NASA Discoveries"));
        bookList.add(new HorrorBook("Animal Graveyard"));
        bookList.add(new HorrorBook("JAVA EE"));

    }

    private List<Book> bookList = new ArrayList<>();

    public Book sellBook(){
        int index = ThreadLocalRandom.current().nextInt(bookList.size());
        return bookList.get(index);
    }


}
