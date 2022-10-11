package JavaStart.Enkapsulacja.Cwiczenie2;

public class Movie {
    String movieTitle;
    String movieType;
    int movieTime;
    int ageRequired;
    int maxSeats;
    int freeSeats;

    public Movie(String movieTitle, String movieType, int movieTime, int ageRequired, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;

    }

    public boolean hasFreeSeats() {
        return freeSeats !=0;
    }
    public void decreaseFreeSeats() {
        freeSeats --;
    }
    public String getMovieInfo() {
        return  movieTitle + " - " + movieType + " - " + movieTime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }


//    void ticketSale() {
//        if (freeSeats == 0) {
//            System.out.println("Brak wolnych miejsc na seans");
//        } else if (watcher.age < ageRequired) {
//            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
//        } else {
//            watcher.ticket.Id = 1;
//            watcher.ticket.PersonData = watcher.firstName + " " + watcher.lastName;
//            watcher.ticket.MovieTitle = "Omen";
//            freeSeats--;
//        }
//
//    }
}
