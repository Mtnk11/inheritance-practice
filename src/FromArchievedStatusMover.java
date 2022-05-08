public class FromArchievedStatusMover extends BookMover{

    public void moveToStatus(Book book,Status status){
        switch (status){
            case ARCHIVED,AVAILABLE -> book.setStatus(status);
            default -> System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
        }

    }
}