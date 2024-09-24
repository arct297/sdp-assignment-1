public class Main {
    public static void main(String[] args) {
        Product cheese = new FoodProduct(5.44);
        Product smartphone = new ElectronicsProduct(44.33);
        Product mop = new HouseHoldProduct(10.00);
        Product dress = new ClothingProduct(30.59);

        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println("The discount for cheese is $" + discountCalculator.calculateDiscount(cheese));
        System.out.println("The discount for smartphone is $" + discountCalculator.calculateDiscount(smartphone));
        System.out.println("The discount for mop is $" + discountCalculator.calculateDiscount(mop));
        System.out.println("The discount for dress is $" + discountCalculator.calculateDiscount(dress));
    }
}
