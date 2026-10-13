import java.util.function.Predicate;

public class CatalogFilter {
    // Before: logic buried in a lambda
        Predicate<Movie> hit = m -> {
            int minMinutes = 90;
            double minRating = 4.0;
            return m.minutes() >= minMinutes
                && m.rating() > minRating;
        };
    
    // Step 1: give the logic a name
        boolean isFeatureHit(Movie m) {
            return m.minutes() >= 90 && m.rating() > 4.0;
        }
    // Step 2: a one-line lambda...
        Predicate<Movie> p1 = m -> isFeatureHit(m);
    // Step 3: ...or a method reference
        Predicate<Movie> p2 = this::isFeatureHit;

        public static void main(String[] args) {
            CatalogFilter filter = new CatalogFilter();
            Movie[] catalog = {
                new Movie("Inception", 148, 4.8),
                new Movie("Night Drive", 95, 4.1),
                new Movie("Coffee Break Shorts", 22, 4.5),
                new Movie("The Endless Saga", 160, 3.2),
                new Movie("Ninety Minutes Flat", 90, 4.0)
            };
            for (Movie movie : catalog) {
                System.out.println(movie.title()
                    + " -> before: " + filter.hit.test(movie)
                    + " | lambda: " + filter.p1.test(movie)
                    + " | method ref: " + filter.p2.test(movie));
            }
        }
    }

