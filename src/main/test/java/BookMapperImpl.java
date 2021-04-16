import com.Jiang.dao.Book.BookMapper;
import com.Jiang.pojo.Book;
import lombok.Data;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component("bookMapperImpl")
public class BookMapperImpl implements BookMapper {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Book> QueryBooks(Map map) {
        return sqlSession.getMapper(BookMapper.class).QueryBooks(map);
    }

    @Override
    public int AddBook(Book book) {
        return sqlSession.getMapper(BookMapper.class).AddBook(book);
    }

    @Override
    public int DeleteBook(Map map) {
        return sqlSession.getMapper(BookMapper.class).DeleteBook(map);
    }
    @Override
    public int UpdataBook(Book book) {
        return sqlSession.getMapper(BookMapper.class).UpdataBook(book);
    }
//    @Test
//    public void t(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Map m=new HashMap();
//        System.out.println("Spring启动!!!!!!!!!!!!!!!!!");
//        List<Book> books = ((BookMapper)applicationContext.getBean("bookMapperImpl")).QueryBooks(m);
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
}

