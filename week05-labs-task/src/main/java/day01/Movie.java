package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String title;
    private List<LocalDateTime> timesOfPerformance = new ArrayList<>();

    public Movie(String title, List<LocalDateTime> timesOfPerformance) {
        this.title = title;
        this.timesOfPerformance = timesOfPerformance;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTimesOfPerformance() {
        return timesOfPerformance;
    }
}
