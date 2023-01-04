package demo;

import com.example.SpringBootJUnitApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootJUnitApplication.class)
public class OuterTest {

    @Test
    public void test4(){
        System.out.println("Outer test run ......");
    }

    @Test
    public void str(){
        System.out.println("""
                {
                    "123":"111123",
                    "233":"32124"
                }
                """);
    }

}
