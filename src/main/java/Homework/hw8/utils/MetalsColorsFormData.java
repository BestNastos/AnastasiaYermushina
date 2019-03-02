package Homework.hw8.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MetalsColorsFormData {
    public List<Integer> summary;
    public List<String> elements;
    public String color;
    public String metals;
    public List<String> vegetables;

    public static String listToStringWithoutBrackets(List<String> metalsColorsPageList){
        return metalsColorsPageList.toString().substring(1,
                metalsColorsPageList.toString().length() - 1);
    }
}
