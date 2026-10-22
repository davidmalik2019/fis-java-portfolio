
package com.fis.portfolio;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectApiController {

    private final List<Map<String, String>> projects = List.of(
        Map.of(
            "name", "JobConnect",
            "number", "Java Project #1",
            "description", "A job portal built with Java Spring Boot and MySQL.",
            "technology", "Java, Spring Boot, MySQL, Spring Security, JWT",
            "url", "/projects/jobconnect"
        ),
        Map.of(
            "name", "Fountain Verify",
            "number", "Java Project #2",
            "description", "A certificate verification system with QR codes.",
            "technology", "Java, Spring Boot, MySQL, Thymeleaf, QR codes",
            "url", "/projects/fountain-verify"
        ),
        Map.of(
            "name", "FIS Java Portfolio",
            "number", "Java Project #3",
            "description", "A portfolio website showcasing Java backend projects.",
            "technology", "Java, Spring Boot, Thymeleaf, HTML, CSS",
            "url", "/projects/fis-java-portfolio"
        )
    );

    @GetMapping
    public List<Map<String, String>> getAllProjects() {
        return projects;
    }

@GetMapping("/names")
public List<String> getProjectNames() {
    return projects.stream()
        .map(project -> project.get("name"))
        .toList();
}


@GetMapping("/{projectName}")
public org.springframework.http.ResponseEntity<Map<String, String>> getProject(
        @PathVariable String projectName) {

    return projects.stream()
        .filter(project -> project.get("name")
            .equalsIgnoreCase(projectName.replace("-", " ")))
        .findFirst()
        .map(project ->
            org.springframework.http.ResponseEntity.ok(project))
        .orElseGet(() ->
            org.springframework.http.ResponseEntity
                .status(org.springframework.http.HttpStatus.NOT_FOUND)
                .body(Map.of(
                    "error", "Project not found",
                    "projectName", projectName
                ))
        );
}

}
