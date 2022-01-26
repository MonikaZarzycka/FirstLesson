package mainOOP;

public class Main {
    public static void main(String[] args)
    {
        CinemaChair cinemaChair = new CinemaChair(5,4);
        cinemaChair.setAvailable(true);
        System.out.println(cinemaChair.getNumber());
        System.out.println(cinemaChair.getRow());
        cinemaChair.isSeatTaken();
    }
}
