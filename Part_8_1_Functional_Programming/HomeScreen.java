import java.util.List;

    public class HomeScreen {

        static void showRow(String name, List<Movie> catalog, MovieFilter rule) {
        System.out.println("=== " + name + " ===");
        for (Movie m : catalog) {
            if (rule.test(m)) {
                System.out.println("  > " + m.title() + " (" + m.minutes() + " min)");
            }
        }
        System.out.println();
        }

        public static void main(String[] args) {
            List<Movie> catalog = List.of(
            new Movie("Midnight Signal", true, false, 118),
            new Movie("The Lantern Fox", true, true, 95),
            new Movie("Empire of Sand", false, false, 172),
            new Movie("Ocean Pals", false, true, 88),
            new Movie("The Long Winter", true, false, 158)
            );

            showRow("New This Week", catalog, m -> m.isNew());
            showRow("Family Night", catalog, m -> m.isKidFriendly());
            showRow("Epic Watches", catalog, m -> m.minutes() > 150);
            showRow("Quick Bites", catalog, m -> m.minutes() < 100);
        }
    }