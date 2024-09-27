package www;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.www.AlterService;
import org.www.Feedback;

@RestController
public class FeedbackController {

    private final AlterService alterService;

    public FeedbackController(AlterService alterService) {
        this.alterService = alterService;
    }

    @PostMapping("/api/feedback")
    public ResponseEntity<String> submitFeedback(@RequestBody Feedback feedback) {
        alterService.sendMessage(String.valueOf(feedback));

        return new ResponseEntity<>("Feedback submitted successfully!", HttpStatus.CREATED);
    }