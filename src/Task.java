interface DiscountCalculatorInterface {
    double calculateDiscount(Product product);
}

interface Product {
    double getDiscount();
    double getPrice();
    void setPrice(double price);
}

class DiscountCalculator implements DiscountCalculatorInterface {

    @Override
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}


class FoodProduct implements Product {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        double discountFactor = 0.10;
        return this.price * discountFactor;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class ElectronicsProduct implements Product {
    private double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        double discountFactor = 0.05;
        return this.price * discountFactor;
    }
    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class ClothingProduct implements Product {
    private double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        double discountFactor = 0.07;
        return this.price * discountFactor;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

class HouseHoldProduct implements Product {
    private double price;

    public HouseHoldProduct(double price) {
        this.price = price;
    }
    @Override
    public double getDiscount() {
        double discountFactor = 0.13;
        return this.price * discountFactor;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}