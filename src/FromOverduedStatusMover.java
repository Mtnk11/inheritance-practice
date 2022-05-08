public class FromOverduedStatusMover extends BookMover{
    public FromOverduedStatusMover() {
    }
    protected void moveToStatus(Book book,Status status){
        switch (status){
            case AVAILABLE,ARCHIVED,OVERDUED ->book.setStatus(status);
            default -> System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
        }
    }
}