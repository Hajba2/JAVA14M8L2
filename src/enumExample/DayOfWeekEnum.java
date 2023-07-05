package enumExample;

public enum DayOfWeekEnum {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isDayOff;

    public boolean isDayOff() {
        return isDayOff;
    }

    DayOfWeekEnum(boolean isDayOff) {
        this.isDayOff = isDayOff;
    }

    public static DayOfWeekEnum valueOf(int ordinal) {
        if (ordinal >= DayOfWeekEnum.values().length) {
            throw new IllegalArgumentException("Your ordinal is bigger than enum size");
        }
        return DayOfWeekEnum.values()[ordinal];
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "name=" + name() +
                " isDayOff=" + isDayOff +
                '}';
    }
}
