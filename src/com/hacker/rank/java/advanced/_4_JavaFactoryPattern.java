package com.hacker.rank.java.advanced;

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        switch(order) {
            case "cake": return new Cake();
            case "pizza":return new Pizza();
        }
        return null;
    }
}


public class _4_JavaFactoryPattern {
}


