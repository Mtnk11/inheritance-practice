public class FromBorrowStatusMover extends BookMover{
    public FromBorrowStatusMover() {
    }

    protected void moveStatus(Book book, Status status){
        switch (status){
            case AVAILABLE,OVERDUED,ARCHIVED, BORROWED-> book.setStatus(status);
            default -> System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");

        }
    }
}