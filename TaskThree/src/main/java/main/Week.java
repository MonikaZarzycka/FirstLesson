package main;

public class Week {
        public static int printWeek (int daysOfTheWeek) {
            switch (daysOfTheWeek) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.println("There is no such a day!");
                    break;
            }

            return daysOfTheWeek;
        }
}
