package anton.sample.aop.library.model;

import org.springframework.stereotype.Component;

/**
 * User: Sedkov Anton
 * Date: 04.07.2021
 */

@Component
public class UniverLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We has got a book from the university.");
        System.out.println("--------------------------------------");
    }

/*    public void getBook(Book book) {
        System.out.println("We has got the book: " + book.getName() + " from the university.");
    }*/


    public void getMagazine() {
        System.out.println("We has got a magazine from the university.");
        System.out.println("--------------------------------------");
    }

 /*   public void getMagazine(int a) {
        System.out.println("We has got a magazine from the university.");
    }*/

    public void returnBook() {
        System.out.println("We has returned a book to the university.");
        System.out.println("--------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We has returned a magazine to the university.");
        System.out.println("--------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("We has added a book to the university library.");
        System.out.println("--------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We has added a magazine to the university library.");
        System.out.println("--------------------------------------");
    }
}
