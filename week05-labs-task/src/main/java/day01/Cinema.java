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
        for (int i = 0; i < movies.size(); i++) {
            List<LocalDateTime> timesOfPerformance = movies.get(i).getTimesOfPerformance();
            for (int j = 0; j < timesOfPerformance.size(); j++) {
                if (time.equals(timesOfPerformance.get(j))) {
                    moviesCanWatch.add(movies.get(i).getTitle());
                }
            }
        }
        return moviesCanWatch;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
