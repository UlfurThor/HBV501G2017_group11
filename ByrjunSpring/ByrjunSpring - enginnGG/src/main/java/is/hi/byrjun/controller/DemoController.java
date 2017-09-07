package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót setur inn
 * skipun
 */
@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {

    // Þar sem klasinn hefur slóðina "/demo", er þessi slóð "/demo/page"
    @RequestMapping("/page")
    public String demoPage() {
        return "demo/demo"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/demo/demo.jsp
        // skoðið application.properties til að sjá hvernig slóðin er sett
    }

    /**
     * Goes to a Hello page with name set as TestUser
     *
     * @param model container for page info
     * @return path to new page
     */
    @RequestMapping("/user")
    public String user(Model model) {
        model.addAttribute("name", "TestUser");
        return "demo/showUser";
    }

    /**
     * Goes to a page that requests a users name
     *
     * @return path to new page
     */
    @RequestMapping("/askName")
    public String askName() {
        return "demo/requestUserName";
    }

    /**
     * goes to a Hello page with name set by user
     *
     * @param name Name of user
     * @param model container page info
     * @return path to new page
     */
    @RequestMapping(value = "/who", method = RequestMethod.POST)
    public String nameWho(
            @RequestParam(value = "name", required = false) String name,
            ModelMap model
    ) {
        model.addAttribute("name", name);
        return "demo/showUser";
    }

    /**
     * goes to a landing page for the project, linking to other parts of it
     * @return path to new page
     */
    @RequestMapping("/start")
    public String start() {
        return "demo/start";
    }

}
