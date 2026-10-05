@FunctionalInterface
    public interface MovieFilter {
        boolean test(Movie movie);
    }