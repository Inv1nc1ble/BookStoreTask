package hillel.com.beans;


public class HorrorBook implements Book {

    private String name;

    public HorrorBook() {
    }

    public HorrorBook(String name) {
        this.name = name;
    }

    @Override
    public void readBook() {
        System.out.printf("%s was read. It was Horrifying", name);
        System.out.println("------------------------------------");
    }

    @Override
    public String getName() {
        return name;
    }
}
