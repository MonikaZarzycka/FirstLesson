package Week;

public class ShowDays {

   private DaysOfWeek days;

   public ShowDays (DaysOfWeek days){
      this.days=days;
   }

   public static void main(String[] args) {
      ShowDays showDays = new ShowDays(DaysOfWeek.MONDAY);
      System.out.println(showDays.days);
   }

}
