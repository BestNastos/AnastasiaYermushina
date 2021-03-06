package Homework.hw6.ex1.Enums;

public enum ServiceSubmenu {
    SUPPORT("SUPPORT"),
    DATES("DATES"),
    SEARCH("SEARCH"),
    COMPLEX_TABLE("COMPLEX TABLE"),
    SIMPLE_TABLE("SIMPLE TABLE"),
    USER_TABLE("USER TABLE"),
    TABLE_WITH_PAGES("TABLE WITH PAGES"),
    DIFFERENT_ELEMENTS("DIFFERENT ELEMENTS"),
    PERFORMANCE("PERFORMANCE");

    private String text;

    ServiceSubmenu(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
