package mainOOP;

public class CinemaRoom {
    private final int chairNumber;
    private final int theRowNumberOfChair;
    public boolean condition;

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int getChairNumber() {
        return this.chairNumber;
    }

    public int getTheRowNumberOfChair() {
        return this.theRowNumberOfChair;
    }

    public CinemaRoom(int chairNumber, int theRowNumberOfChair) {
        this.chairNumber = chairNumber;
        this.theRowNumberOfChair = theRowNumberOfChair;
    }

    public String getSeatCondition (boolean condition){
        if(condition)
        return "Free";
        else
        return "Taken";
    }

}

