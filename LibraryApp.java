import java.util.ArrayList;
import java.util.List;
public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> ourLibraryApp = new LibraryManager<>();


        ourLibraryApp.addItem(book1);
        ourLibraryApp.addItem(book2);
        System.out.println("Here is book 1 and 2: ");
        ourLibraryApp.displayItems();
        System.out.println(" ");
        System.out.println("Now I am going to remove the cookbook and add DVDs:");
        ourLibraryApp.removeItem(book2);
        ourLibraryApp.addItem(dvd1);
        ourLibraryApp.addItem(dvd2);
        ourLibraryApp.displayItems();
        System.out.println(" ");



    }
}
