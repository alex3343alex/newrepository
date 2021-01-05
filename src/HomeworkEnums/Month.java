package HomeworkEnums;

public  enum Month {
    JANUARY(Seasons.WINTER, 31, "january"),
    FEBRUARY(Seasons.WINTER, 28, "february"),
    MARCH(Seasons.SPRING, 31, "march"),
    APRIL(Seasons.SPRING,30, "April"),
    MAY(Seasons.SPRING, 31,"May"),
    JUNE(Seasons.SUMMER, 30,"June"),
    JULY(Seasons.SUMMER,31,"July"),
    AUGUST(Seasons.SUMMER, 31,"August"),
    SEPTEMBER(Seasons.AUTUMN, 30,"September"),
    OCTOBER(Seasons.AUTUMN, 31,"October"),
    NOVEMBER(Seasons.AUTUMN,30,"November"),
    DECEMBER(Seasons.WINTER, 31,"December");

    private final int daysCount;
    private final Seasons season;
    private final String name;


    Month(Seasons season, int daysCount, String name) {
        this.season = season;
        this.daysCount = daysCount;
        this.name = name;
    }

    public static Month[] getWinterMonth() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }


    public static Month[] getSpringMonth() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonth() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonth() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

    @Override
    public String toString() {
        return  "  Month -  " +   name   +
                "  season - '" + season + '\'' +
                ", daysCount - " + daysCount;
    }

}
