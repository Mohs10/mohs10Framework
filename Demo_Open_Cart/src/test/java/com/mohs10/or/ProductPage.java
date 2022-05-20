package com.gcr.or;

import org.openqa.selenium.By;

public class ProductPage {
	public static By imgProduct = By.xpath("//div[@class='product-item']//img[@title='Show details for Smartphone']");
	public static By textProduct = By.xpath("//h1[@itemprop='name']");
	public static By btnCompareList = By.xpath("//input[@value='Add to compare list']");
	public static By imgProduct1 = By.xpath("//img[@title='Show details for Phone Cover']");
	public static By textProduct1 = By.xpath("//h1[@itemprop='name']");
	public static By btnCompareList1 = By.xpath("//input[@value='Add to compare list']");
	public static By btnAddCart = By.xpath("//input[@id='add-to-cart-button-43']");
	public static By btnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

}


