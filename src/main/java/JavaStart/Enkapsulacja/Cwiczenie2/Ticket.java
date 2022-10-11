package JavaStart.Enkapsulacja.Cwiczenie2;

public class Ticket {
    int Id;
    private Movie movieTitle;
    private Watcher watcher;

    public Ticket(int id, Movie movieTitle, Watcher watcher) {
        Id = id;
        this.movieTitle = movieTitle;
        this.watcher = watcher;
    }

    public String getTicketInfo() {
        return getId() + " - " + movieTitle.getMovieInfo() + " - " + watcher.getWatcherInfo();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Movie getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(Movie movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Watcher getWatcher() {
        return watcher;
    }

    public void setWatcher(Watcher watcher) {
        this.watcher = watcher;
    }
}
