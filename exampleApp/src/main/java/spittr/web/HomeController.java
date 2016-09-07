package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by xinglongwang on 9/7/16.
 */
@Controller
@RequestMapping("/")    //  mapping to path '/'
public class HomeController {

    @RequestMapping(method=GET) // handle GET request
    public String home() {
        return "home";
    }

}
