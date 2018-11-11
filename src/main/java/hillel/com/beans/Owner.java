package hillel.com.beans;


public class Owner {
    private Storage storage;

    public Owner() {
    }

//    public Owner(Book book, Storage storage) {
//        this.book = book;
//        this.storage = storage;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }



    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void buyBook(){
        System.out.println("Customer is selecting a book!");
        Book b = storage.sellBook();
        System.out.println(b.getName());

        System.out.println("Owner bought his new book and went home!");
        b.readBook();
    }

}
