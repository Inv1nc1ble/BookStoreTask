package hillel.com.beans;


public class ScienceBook implements Book {

    private String name;

    public ScienceBook() {
    }

    public ScienceBook(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void readBook() {
        System.out.printf("%s was read. It was Educative", name);
        System.out.println("------------------------------------");
    }

}
