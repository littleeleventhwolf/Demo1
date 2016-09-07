package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by xinglongwang on 9/7/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/", method=GET)
    public String home() {
        return "home";
    }

}
