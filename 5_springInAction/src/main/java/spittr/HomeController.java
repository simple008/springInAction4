package spittr;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping(value="/",method=GET)
    public String home(){
        return "home";
    }
}
