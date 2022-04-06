package mvc;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    @InitBinder
    public void initBinder(WebDataBinder dataBinderr){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinderr.registerCustomEditor(String.class,stringTrimmerEditor);
    }


    @RequestMapping("/customerForm")
    public String customerForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "customer-form";
        }
        else{
            return "customer-confirmation";
        }
    }



}
