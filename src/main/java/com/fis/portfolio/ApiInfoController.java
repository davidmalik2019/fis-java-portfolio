
package com.fis.portfolio;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiInfoController {

    @GetMapping("/api")
    public Map<String, Object> getApiInfo() {
        return Map.of(
            "name", "FIS Java Portfolio API",
            "description", "REST API for my Java portfolio projects",
            "endpoints", List.of(
                "GET /api/projects",
                "GET /api/projects/names",
                "GET /api/projects/{projectName}"
            )
        );
    }
}
