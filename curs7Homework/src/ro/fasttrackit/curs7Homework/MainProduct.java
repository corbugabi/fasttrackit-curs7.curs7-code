package ro.fasttrackit.curs7Homework;

public class MainProduct {
    public static void main(String... args) {
        Product firstProduct = new Product("cola", 5, 100, "Suc");
        System.out.println(firstProduct.getName());
        System.out.println(firstProduct.getPrice());
        System.out.println(firstProduct.getQuantity());
        System.out.println(firstProduct.getCategory());
        System.out.println(firstProduct.hasStock());
        System.out.println((firstProduct.isCategory("Suc")));

        System.out.println("--------------------------------");

        Product secondProduct = new Product("cips",3,1000,"gustari");
        System.out.println(secondProduct.getName());
        System.out.println(secondProduct.getPrice());
        System.out.println(secondProduct.getQuantity());
        System.out.println(secondProduct.getCategory());
        System.out.println(secondProduct.hasStock());
        System.out.println((secondProduct.isCategory("Suc")));

        System.out.println("--------------------------------");

        Product thirdProduct = new Product("burger",25,10,"fastfood");
        System.out.println(thirdProduct.getName());
        System.out.println(thirdProduct.getPrice());
        System.out.println(thirdProduct.getQuantity());
        System.out.println(thirdProduct.getCategory());
        System.out.println(thirdProduct.hasStock());
        System.out.println((thirdProduct.isCategory("fastfood")));
    }
}
