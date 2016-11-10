package kooknaja; /**
 * Created by ratchasit.amo on 10/11/2016.
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld{

    @RequestMapping("/")
    public String index(){
        return "Hello, world";
    }

    @RequestMapping(value="/{name}/{last}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String testPath(@PathVariable String name, @PathVariable("last") String l){
        return "Hello, " + name + l;
    }

    @RequestMapping(value = "/test/api", method = RequestMethod.POST)
    public  String testPost(@RequestBody String name){
        return name + " " + "this is added from the REST API";
    }



}
