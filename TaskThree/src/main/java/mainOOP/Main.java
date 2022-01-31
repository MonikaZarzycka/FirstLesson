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
        System.out.println(" ");
        System.out.println("_________________________________________");
        System.out.println(" ");
        System.out.println("Managers");
        System.out.println(" ");
        Manager manager = new Manager("Bob", "Brown",2014);
        System.out.println(manager.getName()+" "+manager.getSurname());
        System.out.println(manager.calculateMonthlySalary());
        System.out.println(manager.getYearOfEmployment());
        System.out.println(" ");
        System.out.println("Ticket Sellers");
        TicketSeller ticketSeller = new TicketSeller("Noah","Cameron",2005);
        System.out.println(ticketSeller.getName()+" "+ticketSeller.getSurname());
        System.out.println(ticketSeller.calculateMonthlySalary());
        System.out.println(ticketSeller.getYearOfEmployment());
        System.out.println(" ");
        System.out.println("_________________________________________");
        System.out.println(" ");
        Converter converter = new Converter(5);
        System.out.println(converter.getMinutes());
        System.out.println(Converter.minutesToSeconds());

    }
}
