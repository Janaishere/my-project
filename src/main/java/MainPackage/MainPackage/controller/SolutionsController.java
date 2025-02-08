package MainPackage.controller;

import MainPackage.service.SolutionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/solutions")
public class SolutionsController {

    private final SolutionServiceImpl solutionService;

    @Autowired
    public SolutionsController(SolutionServiceImpl solutionService) {
        this.solutionService = solutionService;
    }

    // Your endpoints here
}
