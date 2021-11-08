package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> moviesCanWatch = new ArrayList<>();
        for (Movie movie: movies) {
            List<LocalDateTime> timesOfPerformance = movie.getTimesOfPerformance();
            for (int j = 0; j < timesOfPerformance.size(); j++) {
                if (isEqualsTime(time, timesOfPerformance, j)) {
                    moviesCanWatch.add(movie.getTitle());
                }
            }
        }
        return moviesCanWatch;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private boolean isEqualsTime(LocalDateTime time, List<LocalDateTime> timesOfPerformance, int j) {
        return time.equals(timesOfPerformance.get(j));
    }
}
