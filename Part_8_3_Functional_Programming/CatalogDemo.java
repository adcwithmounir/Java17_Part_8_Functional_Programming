import java.util.ArrayList;

public class CatalogDemo {

    record Movie(String title, boolean kidsFriendly){};

    interface MovieFactory {
	    Movie make(String t, boolean k);
    }

    interface MovieFilter {
	    boolean keep(Movie m);
    }

    public static void main(String[] args) {
            
        var catalog = new ArrayList<Movie>();
        MovieFactory factory = Movie::new; //shape 4
        catalog.add(factory.make("Coco", true));
        catalog.add(factory.make("Narcos", false));

        System.out.println("Full catalog");
        catalog.forEach(System.out::println);

        MovieFilter family = Movie::kidsFriendly; //shape 3

        catalog.removeIf(m -> !family.keep(m));
        System.out.println("Family catalog:");
        catalog.forEach(System.out::println); //shape 2
    }
}