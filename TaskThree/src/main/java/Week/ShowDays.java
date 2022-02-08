package Week;

public class ShowDays {

   public static String GetDay (DaysOfWeek days){
      return String.valueOf(days);
   }
}
 class MAinDays{
    public static void main(String[] args) {
       DaysOfWeek days = DaysOfWeek.MONDAY;
       System.out.println(ShowDays.GetDay(DaysOfWeek.MONDAY));
    }
 }