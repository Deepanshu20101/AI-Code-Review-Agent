package org.java_project.apps.ai_code_review_agent.controllers;

import org.java_project.apps.ai_code_review_agent.model.CodeRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/ai")
public class AIController {

    @PostMapping("/get-response")
    public ResponseEntity<?> getAIResponse(@RequestBody CodeRequest request){
        if(request.getCode() ==null || request.getCode().trim().isEmpty()){
            return ResponseEntity.badRequest().body("Missing or empty 'code' parameter");
        }
    }

    @GetMapping("/health")
    public String Health(){
        return "Healthy Upstream";
    }
}
