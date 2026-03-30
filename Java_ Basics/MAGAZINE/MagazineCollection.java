package MAGAZINE;
public class MagazineCollection {
    private Magazine[] collection;
    private int count;
    private double totalCost;

    //Constructor 
    public MagazineCollection() {
        collection = new Magazine[100]; 
        count = 0;
        totalCost = 0.0;
    }

    //Add magazine and check if it fits in the 100 collection
    public void add(String maTitle, String month, double cost) {
    	if (count < collection.length) {
            collection[count] = new Magazine(maTitle, month, cost);
            totalCost += cost;
            count++;
        } 
    	else {
            System.out.println("Collection is full.");
        }
    }

    //Remove magazine and shifting them to higher ones after removal
    public void remove(String maTitle, String month) {
        for (int i = 0; i < count; i++) {
            if (collection[i].getTitle().equals(maTitle) && collection[i].getMonth().equals(month)) {
                totalCost -= collection[i].getPrice();
                //Shift 
                for (int shift = i; shift < (count - 1); shift++) {
                    collection[shift] = collection[shift + 1];
                }
                count--;
                collection[count] = null;
                return;
            }
        }
        System.out.println("Magazine not found in collection.");
    }
    
    //toString
    public String toString() {
        String result = "Number of magazines: " + count + "\n";
        result += "Total cost: $" + totalCost + "\n\n";
        
        for (int i = 0; i < count; i++) {
            result += collection[i].toString() + "\n";
        }
        return result;
    }
}