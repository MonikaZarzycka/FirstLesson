package ParamsMockito;

import java.time.Month;

public class ShowSeason {
    public static String getSeason(Month month) {
        if (month == null) {
            return "";
        }
        String season = "";
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Seasons.WINTER.toString();
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season = Seasons.SPRING.toString();
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = Seasons.SUMMER.toString();
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Seasons.AUTUMN.toString();
        }
        return season;
    }
}
