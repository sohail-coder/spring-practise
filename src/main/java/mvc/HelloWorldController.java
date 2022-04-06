package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String showForm(){
        return "showForm";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "processForm";
    }

    @RequestMapping("processFormv2")
    public String processFromv2(HttpServletRequest request, Model model){
       String name = request.getParameter("theName");
       name=name.toUpperCase(Locale.ROOT);
       String res = "yo! "+name;
       model.addAttribute("message",res);
        return "processFormv2";
    }
}
