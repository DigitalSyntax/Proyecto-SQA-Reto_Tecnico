package AUTOMATION_TEST.Locators;

import org.openqa.selenium.By;

public class Locators {
    public static By Destellos = By.xpath("//li[@class='product type-product post-982 status-publish instock product_cat-4-amor-y-romance-flores-san-angel-floristerias product_cat-31-aniversarios-san-angel-floristerias-medellin-regalos product_cat-13-ella product_cat-compra-por-ocasion product_cat-8-ramos-de-flores-para-cumpleanos product_cat-35-mes-de-la-madre product_cat-22-rosas-san-angel-floristerias-medellin has-post-thumbnail featured shipping-taxable purchasable product-type-variable has-default-attributes']//h2[@class='woocommerce-loop-product__title'][normalize-space()='Destellos']");
    public static By TomorrowsDate = By.xpath("//div[@class='row']//div[2]//div[1]");
    public static By Time = By.xpath("//div[@class='row']//div[2]//div[2]//a[2]");
    public static By Colors = By.xpath("//li[@title='Rosado']//span[@class='variable-item-span variable-item-span-color']");
    public static By DescripcionText = By.xpath("//h2[normalize-space()='Descripción']");
    public static By Amount = By.cssSelector("button[type='submit']");


}