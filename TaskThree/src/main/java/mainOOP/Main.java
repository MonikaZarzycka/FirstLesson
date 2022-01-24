package mainOOP;

public class Main {
    public static void main(String[] args)
    {
        CinemaRoom cinemaRoom = new CinemaRoom(5,4);
        cinemaRoom.setCondition(true);
        System.out.println(cinemaRoom.getChairNumber());
        System.out.println(cinemaRoom.getTheRowNumberOfChair());
        System.out.println(cinemaRoom.getSeatCondition(cinemaRoom.condition));


    }
}
