package JDI;

import JDI.pages.HomePageJDI;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;

@JSite("https://epam.github.io/JDI/")
public class EpamSite {

    @Url("index.html")
    public static HomePageJDI homePageJDI;
}
