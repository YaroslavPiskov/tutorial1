package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.tutorials.model.Category;
import net.thucydides.core.pages.PageObject;

public class CategoryNavigationBar extends PageObject{
    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
}
