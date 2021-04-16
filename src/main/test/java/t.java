
import com.Jiang.pojo.Book;
import com.Jiang.service.BookService;
import com.Jiang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t {
    @Test
    public void t1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Map m=new HashMap();
        System.out.println("Spring启动!!!!!!!!!!!!!!!!!");
//         List<Book> books = ((BookMapper)applicationContext.getBean("bookMapperImpl")).QueryBooks(m);
        BookService bookService= (BookService) (applicationContext.getBean("bookServiceImpl"));
//        bookService.AddBook(new Book(4,"1",33,"3"));
        m.put("bookId",3);
        List<Book> books = bookService.QueryBooks(m);
        System.out.println(books);
        System.out.println(books.get(0));

//      List<Book> books =bookService.QueryBooks(m);
//      for (Book book : books) {
//            System.out.println(book);
//      }

    }
    @Test
    public void t2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Map m=new HashMap();
        System.out.println("Spring启动!!!!!!!!!!!!!!!!!");
//         List<Book> books = ((BookMapper)applicationContext.getBean("bookMapperImpl")).QueryBooks(m);
        UserService userService=(UserService)applicationContext.getBean("UserServiceImpl");
        System.out.println(" 得到");
        System.out.println(userService.Login(m));
    }


}
