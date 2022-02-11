package ParamsMockito;

import java.time.Month;

public class ShowSeason {
    public static Seasons getSeason (Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Seasons.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.AUTUMN;
            default: throw new IllegalArgumentException();
        }

    }
}
