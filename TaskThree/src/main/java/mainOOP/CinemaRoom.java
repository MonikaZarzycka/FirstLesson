package mainOOP;

public class CinemaRoom {
    private final int chairNumber;
    private final int theRowNumberOfChair;
    public String condition;

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
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

}