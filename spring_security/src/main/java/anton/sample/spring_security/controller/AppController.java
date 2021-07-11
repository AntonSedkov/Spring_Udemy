package anton.sample.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: Sedkov Anton
 * Date: 11.07.2021
 */

@Controller
public class AppController {

    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "all_emps";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "hr_view";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers() {
        return "manager_view";
    }

}
