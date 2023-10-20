package org.example;

public class Vegetables {
    private String name;
    private String color;
    private double size;
    private double weight;
    private String taste;

    private double price;

    public Vegetables(){
        name = "";
        color = "";
        size = 0;
        weight = 0;
        taste = "";
        price = 0.0;
    }

    public Vegetables(String vegName, String vegColor, Double vegSize, Double vegWeight, String vegTaste, double vegPrice){
        name = vegName;
        color = vegColor;
        size = vegSize;
        weight = vegWeight;
        taste = vegTaste;
        price = vegPrice;
    }

    private void setName(String vegName){
        name = vegName;
    }

    public void setColor(String vegColor){
        color = vegColor;
    }
    public void setSize(double vegSize){
        size = vegSize;
    }

    public void setWeight(double vegWeight){
        weight = vegWeight;
    }
    public void setTaste(String vegTaste){
        taste = vegTaste;
    }

    public String getTaste(){
        return taste;
    }

    public  void setPrice(double vegPrice){
        price = vegPrice;
    }

    public double getPrice(){
        return  price;
    }

//    public void getTheVegetable(){
//        System.out.println("The vegetable name "+
//                name+
//                " Its color is "+ color+
//                " Its size is" + size +
//                "  Its taste is "+ taste
//                + " Its price is " + price);
//    }

    public String sayHello(String name){
        return "Hi There, " + name;
    }

    public void testMethod(){
        int a = 55;

        System.out.println(a);
    }

    public void testMethod2(){
        int a = 65;

        System.out.println(a);
    }

    public void testMethod3(){
        int c = 69;
        System.out.println(c);
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
