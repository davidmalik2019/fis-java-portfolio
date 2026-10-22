
package com.fis.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/projects/fountain-verify")
    public String fountainVerify() {
        return "fountain-verify";
    }

@GetMapping("/projects/fis-java-portfolio")
public String fisJavaPortfolio() {
    return "fis-java-portfolio";
}

    @GetMapping("/projects/jobconnect")
    public String jobconnect() {
        return "jobconnect";
    }
}
