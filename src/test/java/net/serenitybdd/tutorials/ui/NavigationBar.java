package net.serenitybdd.tutorials.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.tutorials.model.Category;

public class NavigationBar {

    public static Target category(Category category) {
        Target target = Target.the(category.name() + " category")
                .locatedBy("//td[@class='cat lw']/a[contains(text(), '{0}')]")
                //.locatedBy("*[role=navigation] *[role=list]/a[contains(text(), '{0}')]")
                .of(category.name());
        return target;
    }
}
