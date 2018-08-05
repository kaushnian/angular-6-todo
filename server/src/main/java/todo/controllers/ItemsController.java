package todo.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import todo.models.Item;

@RestController
public class ItemsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("api/greeting")
    public Item greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Item(counter.incrementAndGet(),
                            String.format(template, name), false, false);
    }
}
