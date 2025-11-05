package Listing;

public class Test {
    public static void main(String[] args) {
        CircularList list = new CircularList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.countNodes();
        list.displayForward();
        

        list.delete(20);

        list.countNodes();
        list.displayForward();

        list.insertBegining(0);

        list.countNodes();
        list.displayForward();
    }
}
