package Question1;

public class LibraryItem {

    private String itemID;
    private String author;
    private String title;

    private void checkout(){
        System.out.println("Checkout");
    }

    private void returnItem(){
        System.out.println("Returning the item");
    }
}
