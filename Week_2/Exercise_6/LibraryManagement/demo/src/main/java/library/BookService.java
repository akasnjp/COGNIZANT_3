import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BookService {
    private BookRepository bookRepository;
    
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void displayBookRepository(){
        System.out.println("The Book Repository is : "+bookRepository);
    }
}
