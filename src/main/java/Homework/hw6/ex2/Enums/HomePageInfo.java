package Homework.hw6.ex2.Enums;

public enum HomePageInfo {

    HOME_PAGE("https://epam.github.io/JDI/index.html");

    private String value;

    HomePageInfo(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
