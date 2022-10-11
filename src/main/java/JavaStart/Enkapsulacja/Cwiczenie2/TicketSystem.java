package JavaStart.Enkapsulacja.Cwiczenie2;

public class TicketSystem {
    Ticket createTicket(Movie movie,Watcher watcher){
        if(movie.freeSeats==0) {
            System.out.println("brak wolnych miejsc");
            return null;
        } else if (watcher.age < movie.ageRequired) {
            System.out.println("Film dostępny dla osób powyżej " + movie.ageRequired + " lat");
            return null;
        } else {
            int id = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return new Ticket(id, movie, watcher);
        }
    }
    private int generateNextTicketId(Movie movie) {
        return movie.getMaxSeats() - movie.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAgeForMovie(Watcher watcher, Movie movie) {
        return watcher.getAge() >= movie.getAgeRequired();
    }
}
