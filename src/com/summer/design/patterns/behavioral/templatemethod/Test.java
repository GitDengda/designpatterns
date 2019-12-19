package com.summer.design.patterns.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        ACaffeineBeverage coffee = new Coffee();
        coffee.preparRecipe();

        System.out.println("");

        ACaffeineBeverage tea = new Tea();
        tea.preparRecipe();
    }
}
