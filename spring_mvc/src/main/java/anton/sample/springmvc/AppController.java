package anton.sample.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * User: Sedkov Anton
 * Date: 10.07.2021
 */

@Controller
@RequestMapping("/emp")
public class AppController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {

/*        Employee employee = new Employee();
        employee.setName("John");
        employee.setSurname("Dow");
        employee.setSalary(1000);
        model.addAttribute("employee", employee);*/

        model.addAttribute("employee", new Employee());
        return "ask-details";
    }

    @RequestMapping("/showDetails")
    public String showDetails(
            @Valid
            @ModelAttribute("employee")
                    Employee emp,
            BindingResult bindingResult) {

        String targetPage = "show-details";

        if (bindingResult.hasErrors()) {
            targetPage = "ask-details";
        }

       /* emp.setName("Mr. " + emp.getName());
        emp.setSurname(emp.getSurname() + "!");
        emp.setSalary(emp.getSalary() * 2);
*/
        return targetPage;
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
