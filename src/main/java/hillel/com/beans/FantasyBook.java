package hillel.com.beans;


public class FantasyBook implements Book {

    private String name;

    public FantasyBook() {
    }

    public FantasyBook(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void readBook() {
        System.out.printf("%s was read. It was Exiting\n", name);
        System.out.println("------------------------------------");
    }

}
