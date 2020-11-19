package org.wz.control;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

    @RequestMapping("/hello/{a}")
    public String toHello(Model model, @PathVariable String a){
        model.addAttribute("msg","result");
        System.out.println(a);
        return "forward:/hello.jsp";
    }
}
