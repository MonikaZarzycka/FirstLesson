package mainOOP;

public class CinemaChair {
    private final int number;
    private final int row;
    private boolean available;


    public int getNumber() {
        return this.number;
    }

    public int getRow() {
        return this.row;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public CinemaChair(int number, int row) {
        this.number = number;
        this.row = row;
    }

    public void isSeatTaken() {
    if(getAvailable()){
        System.out.println("It's free");
    }
    else {
        System.out.println("No it's taken");
        }
    }
}