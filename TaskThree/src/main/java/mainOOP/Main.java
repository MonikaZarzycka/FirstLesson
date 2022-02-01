package mainOOP;

public class Main {
    public static void main(String[] args)
    {
        CinemaChair cinemaChair = new CinemaChair(5,4);
        cinemaChair.setAvailable(true);
        System.out.println(cinemaChair.getNumber());
        System.out.println(cinemaChair.getRow());
        System.out.println(cinemaChair.getAvailable());
        System.out.println(" ");
        System.out.println("_________________________________________");
        System.out.println(" ");
        Movie movie = new Movie("Avatar", "James", "Cameron", 162, 2009);
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirectorName() + " " + movie.getDirectorSurname());
        System.out.println(movie.getMinutesLong());
        System.out.println(movie.getYear());
















    }
}
