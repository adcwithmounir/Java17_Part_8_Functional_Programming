import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CatalogLabelingDemo {

     record Movie(String title, int min, double rating, boolean kids) {}

     public static void main(String[] args) {
        List<Movie> catalog = List.of(
        new Movie("Dune", 155, 8.0, false),
        new Movie("Coco", 105, 8.4, true),
        new Movie("Enola Holmes", 123, 6.6, true),
        new Movie("Sing", 108, 7.1, true)
        );

        Predicate<Movie> kids = Movie::kids;
        Predicate<Movie> top = m -> m.rating() >= 7;
        Function<Movie, String> label = m -> m.title() + " (" + m.min() + " min)";
        Consumer<String> show = s -> System.out.println("[TV] " + s);

        for (Movie m : catalog)
            if (kids.and(top).test(m))
                show.accept(label.apply(m));

    }


    }