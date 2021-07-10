package anton.sample.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */

@Controller
@RequestMapping("/emp")
public class AppController {

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-details";
    }



    /*@RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-details";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("empName") String employeeName, Model model) {

        employeeName = "Mr. " + employeeName + "!!! ";
        model.addAttribute("name", employeeName);

        return "show-details";
    }*/

/*    @RequestMapping("/showDetails")
    public String showDetails(){
        return "show-details";
    }*/

    /*@RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("empName");
        empName = "Mr. " + empName + "!!! ";
        model.addAttribute("name", empName);
        model.addAttribute("description", "True hero");

        return "show-details";
    }*/

}
