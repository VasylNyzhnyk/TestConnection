package hello;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MenuController {
    


    @GetMapping("/vegan")
    public String vegan(@RequestParam(name="name", required=false, defaultValue="vegan") String name, Model model) {
        model.addAttribute("name", name);


        return "vegan";


    }

   @GetMapping("/noVegan")
    public String noVegan(@RequestParam(name="name", required=false, defaultValue="noVegan") String name, Model model) {
        model.addAttribute("name", name);
        return "noVegan";
    }

}