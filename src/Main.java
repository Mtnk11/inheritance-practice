public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        System.out.println();

        Book book1 = new  Book("The Lord of the Rings I");
        BookMover fromArchivedStatusMover = new FromArchievedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book1.getStatus());
        System.out.println();

        Book book2 = new  Book("The Lord of the Rings II");
        BookMover fromBorrowStatusMover = new FromBorrowStatusMover();
        fromBorrowStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book2.getStatus());
        System.out.println();

        Book book3= new  Book("The Lord of the Rings III");
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromOverduedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book3.getStatus());

    }
}