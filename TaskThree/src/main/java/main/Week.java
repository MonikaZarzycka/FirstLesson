package main;
//Zaimplementuj metodę, która na podstawie argumentu wejściowego (liczba całkowita) zwróci nazwę dnia tygodnia. Jeżeli argument wejściowy jest równy

  //      ●     1 - 5 wówczas metoda powinna zwrócić dzień tygodnia, np. “Monday”,

    //    ●     6 lub 7 metoda powinna zwrócić “Weekend”

      //  ●     >7 metoda zwraca komunikat “There is no such a day!”

//        Do powstałego kodu należy również dopisać testy jednostkowe.

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
