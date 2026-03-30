package MAGAZINE;
public class MagazineCollectionTest{
    public static void main(String[] args) {
        MagazineCollection magazine1 = new MagazineCollection();
        
        //Add 
        magazine1.add("Time", "January", 5.99);
        magazine1.add("Time", "April", 5.99);
        magazine1.add("National Geographic", "February", 6.50);
        magazine1.add("The Atlantic", "February", 11.99);
        magazine1.add("AARP The Magazine", "June", 11.99);
        
        System.out.println("The collection of magazines consist of:");
        System.out.println(magazine1);

        //Remove
        magazine1.remove("Time", "January");
        magazine1.remove("The Atlantic", "February");
        //magazine1.remove("National Geographic", "February");
        
        System.out.println("Collection of the magazines after removal:");
        System.out.println(magazine1);
    }
}