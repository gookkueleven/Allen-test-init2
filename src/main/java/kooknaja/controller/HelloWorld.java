package kooknaja.controller; /**
 * Created by ratchasit.amo on 10/11/2016.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld{

    @RequestMapping("/")
    public String index(){
        return "Hello, world";
    }
}
