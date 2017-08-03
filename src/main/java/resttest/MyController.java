package resttest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class MyController {

    //
    @RequestMapping("/")
    public SomeEntity home() {
        SomeEntity someEntity = new SomeEntity();
        someEntity.setEntityName("sss");
        someEntity.setEntityNumber(333);
        return someEntity;
    }

    //получает json-объект, и печатает его в консоль
    @RequestMapping("/getEntity")
    public void getEntity(@RequestBody SomeEntity entity) {
        System.out.println(entity);
    }
}
