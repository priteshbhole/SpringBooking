package firsttry.booking;

/**
 * Created by pritesh on 06/10/16.
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello (){
        return "Hello";
    }
}
