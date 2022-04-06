package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller

@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        Student student = new Student();
        theModel.addAttribute("student",student);


        return "student-form";
    }

    @RequestMapping("/processForm")

    public String processForm(@ModelAttribute("student") Student theStudent){
        theStudent.setFirstName(theStudent.getFirstName().toUpperCase(Locale.ROOT));
        theStudent.setLastName(theStudent.getLastName().toUpperCase(Locale.ROOT));

        return "student-confirmation";
    }












}
